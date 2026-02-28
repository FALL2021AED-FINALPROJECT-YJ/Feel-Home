import { createRequire } from "module";
const require = createRequire(import.meta.url);
const pdf = require("pdf-parse"); 

import { Groq } from "groq-sdk";
import multer from "multer";
import express from "express";
import path from "path";
import fs from "fs";
import User from "../models/User.js"; 

const router = express.Router();

// Initialize Groq with your new key
const groq = new Groq({
  apiKey: "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" 
});

const parsePDF = pdf;


// select a job  and then write cover letter by reading job description
router.post("/generate-resume", async (req, res) => {

  try {
        const { jobData } = req.body;

        const rawEmail = req.cookies.userEmail;
        if (!rawEmail) return res.status(401).json({ message: "No cookie found" });
        const email = decodeURIComponent(rawEmail);

      // 1. Find User by Email to get the file path
        const user = await User.findOne({ email });
        if (!user || !user.resumePath) {
            return res.status(404).json({ message: "No resume found for this user." });
        }

        // 2. Resolve the path and check if file exists
        const absolutePath = path.resolve(user.resumePath);
        if (!fs.existsSync(absolutePath)) {
            return res.status(404).json({ message: "File missing on server." });
        }

        // 3. Read and Parse the PDF
        const dataBuffer = fs.readFileSync(absolutePath);
        const pdfData = await pdf(dataBuffer);
        const resumeText = pdfData.text;
      
        const systemPrompt = `You are an expert Executive Career Coach and Technical Recruiter. 
        Your goal is to tailor resumes to pass high-end ATS (Applicant Tracking Systems) and impress human recruiters.

        CRITICAL CONSTRAINTS:
        1. DO NOT use flowery AI language (e.g., "Passionate storyteller," "Leveraging synergies," "Deep dive," "Cutting-edge"). 
        2. Use strong action verbs (e.g., "Developed," "Architected," "Reduced," "Spearheaded").
        3. Focus on quantifiable achievements (numbers, %, $).
        4. Output should be in clean Markdown format with clear headings.
        5. Keep the formatting professional and minimalist.`;

        const userPrompt = `
        Act as an expert career coach. 
        Target Job: ${jobData.title} at ${jobData.company}
        Job Description: ${jobData.description}

        My Current Resume Content: 
        ---
        ${resumeText}
        ---

        INSTRUCTIONS:
        1. Rewrite my Professional Summary to align with the Target Job.
        2. Select and rewrite my bullet points to highlight the skills most relevant to the Job Description.
        3. Ensure keywords from the Job Description are naturally integrated.
        4. If my resume has gaps, do not hallucinate facts; simply emphasize the most transferable skills I already have.
        `;

        const chatCompletion = await groq.chat.completions.create({
          messages: [
            { role: "system", content: systemPrompt },
            { role: "user", content: userPrompt },
          ],
          model: "llama-3.1-8b-instant",
          temperature: 0.7, // Keeps it professional but creative enough to rephrase
        });

        const tailoredResume = chatCompletion.choices[0]?.message?.content || "";

        res.json({ success: true, customizedResume: tailoredResume});
     
  } catch (error) {
   console.error("Groq Error:", error.message);
    res.status(500).json({ error: "Generation failed", details: error.message });
  }
});


export default router;