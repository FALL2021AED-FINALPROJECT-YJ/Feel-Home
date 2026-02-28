import { createRequire } from "module";
const require = createRequire(import.meta.url);
const pdf = require("pdf-parse"); 


import Job from "../models/Job.js";
import { Groq } from "groq-sdk";
import multer from "multer";
import express from "express";
import path from "path";
import fs from "fs";
import { pipeline } from '@xenova/transformers';

const router = express.Router();

const groq = new Groq({
  apiKey: "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" 
});

const parsePDF = pdf;
console.log("Checking parsePDF type:", typeof parsePDF); // Test it immediately



// Initialize the extractor outside the route to keep it in memory (warms up the cache)
let extractor;
const getExtractor = async () => {
    if (!extractor) {
        extractor = await pipeline('feature-extraction', 'Xenova/all-MiniLM-L6-v2'); // telll model turn text to numerical 
    }
    return extractor;
};

const sleep = (ms) => new Promise(resolve => setTimeout(resolve, ms));

// fetch only matching jobs based on "Selected roles"
router.post("/match",  async (req, res) => {
          let resumeText = "";
        let resumeVector = null;
  try {
        const { roles, resumePath } = req.body;    // roles : ["Frontend", "BACKEND"]

        if (!resumePath) {
          return res.status(400).json({ message: "Resume file is missing" });
        }

        const absolutePath = path.resolve(resumePath);
        if (!fs.existsSync(absolutePath)) {
            return res.status(404).json({ message: "File not found on server" });
        }


        // --- 1. SMART PARSER SELECTOR ---
        // Your debug log showed: PDFParse: [class (anonymous)]
        const dataBuffer = fs.readFileSync(absolutePath);

        const parsePdf = (typeof pdf === 'function') ? pdf : (pdf.default || pdf.parse);

        if (typeof parsePdf !== 'function') {
          console.log("Current pdf variable structure:", pdf);
          throw new Error("STILL not a function. Try: npm install pdf-parse");
        }

        const pdfData = await parsePdf(dataBuffer);
        const resumeText = pdfData.text;
        console.log("✅ SUCCESS! Extracted resume text.");


    // 2. NEW: Generate Vector for the Resume
        if(resumeText){
          console.log("Generating resume embedding...");
          const generateEmbedding = await getExtractor();
          const output = await generateEmbedding(resumeText, { pooling: 'mean', normalize: true });
          //pooling : 100 words = 100 vectors [ 1,2,3....] [4,5,6,....] [7,8,9.......]
          //evry words has 384 diffrnt points based on context eg Java -> [0.1, 0.9. 0.6,......]
          // polling -> That final list of 384 averages is your Resume Vector. [0.8, -0.1, 0.4,.........]
           //[0.8, -0.1, 0.4,.........] -> this will turn to 1 single point
          // normalize -> 

          resumeVector = Array.from(output.data);
        }else {
            return res.status(400).json({ error: "No text could be extracted from resume." });
        }


        // 3. NEW: Hybrid Vector Search
        // We find the top 20 jobs that match the vector AND belong to the selected roles
        console.log("Searching database using Vector Similarity...");

        if (!resumeVector) throw new Error("Resume vector generation failed.");

        const jobs = await Job.aggregate([
            {
                "$vectorSearch": {
                    "index": "vector_index", 
                    "path": "embedding", // The field name in your DB
                    "queryVector": resumeVector,
                    "numCandidates": 100, 
                    "limit": 20,
                    "filter": { "category": { "$in": roles } } // first filter job using index
                }
            }
        ]);

        console.log(`--- DEBUG: ${jobs.length} SEMANTIC JOBS FOUND ---`);
        if (jobs.length === 0) {
            return res.status(200).json({ jobList: [], message: "No semantically similar jobs found." });
        }


      const minimizedJobs = jobs.map(j => ({
        title: j.title.replace(/<[^>]*>/g, '').replace(/"/g, "'"),
        company: j.company.replace(/<[^>]*>/g, '').replace(/"/g, "'"),
        applyLink: j.applyLink 
      }));

    //Now u found jobs based on vector search, give it to Model for semantic matching
    // 3. Do a semantic matching resume ==  job.description; Rag (retreive from db and give to prompt, no hallucinatio)
    let finalMatches = [];
    for (const job of minimizedJobs) {
      try {
        const chatCompletion = await groq.chat.completions.create({
          messages: [
          { 
            role: "system",
            content: `You are a recruitment engine. 
                      Calculate the final matching percentage (0-100) based on skills and experience.
                      Return ONLY a JSON object with the final calculated number. Do NOT show your math.
                      Example Output: {"score": 75}
          
              SCORING RULES:
            - 40% Skills (Tech Stack)
            - 30% Experience (Years/Seniority)
            - 30% Industry fit`
          },
          {
            role: "user",
            content: `I have provided a list of SPECIFIC jobs from my database below. 
                      Do NOT use your general knowledge to suggest jobs. 

                    RESUME: ${resumeText}
                    JOB TITLE: ${job.title}
                    COMPANY: ${job.company}
                    DESCRIPTION: ${job.description}`

            }
          ],
            model: "llama-3.1-8b-instant",
            response_format: { type: "json_object" }
        });

        // 3. Only add if it's a relevant match
        const aiResult = JSON.parse(chatCompletion.choices[0].message.content);
        const score = aiResult.score;

        console.log(`🔍 Job: ${job.title} | Score: ${score}`);

        if(aiResult.score > 30) { 
          finalMatches.push({
            jobTitle: job.title,
            company: job.company,
            matchingScore: aiResult.score,
            applyLink: job.applyLink, // We use the link from our DB, not the AI's version
          });
        }
      } catch (loopErr) {
          console.error(`Error scoring job ${job.title}:`, loopErr.message);
      }

        await sleep(2100); // Rate limit protection
    }
  // 6. Sort results by score
    finalMatches.sort((a, b) => b.matchingScore - a.matchingScore);

    console.log("📤 SENDING TO FRONTEND");
    res.status(200).json({ jobList: finalMatches });

  } catch (error) {
      console.error("Pipeline Error:", error);
      res.status(500).json({ message: "Server error during matching" });
  }
});

export default router;