import fetch from "node-fetch";
import { load } from "cheerio"; // ✅ often cleaner
import Job from "../models/Job.js";
import { Groq } from "groq-sdk";


const groq = new Groq({
  apiKey: "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" 
});


// scarpper scarps gets raw data jobs and tells AI model to catergorize it within 5 buckets.
const fetchJobDescription = async (jobUrl) => {
  try {
    const res = await fetch(jobUrl, { headers: { "User-Agent": "Mozilla/5.0" } });
    const html = await res.text();
    const $ = load(html);
    
    // Lever usually puts descriptions in sections with class 'section' or '.content'
    // We grab all text inside the main posting area
    const description = $(".section.page-centered").text().trim();
    return description;
  } catch (error) {
    console.error(`Could not fetch description for ${jobUrl}:`, error);
    return "";
  }
};


export const scrapeCollateJobs = async () => {
  const url = "https://jobs.lever.co/collate";
  const res = await fetch(url, { headers: { "User-Agent": "Mozilla/5.0" } });
  const html = await res.text();
  const $ = load(html);

    let initialJobs = [];
    // Step 1: Get the basic info and links
    $(".posting").each((_, el) => {
      const title = $(el).find(".posting-title h5").text().trim();
      const link = $(el).find(".posting-title").attr("href");
      
      if (link) {
        const parts = link.split('/').filter(p => p);
        const jobId = parts[parts.length - 1];

        initialJobs.push({
          jobId,
          title,
          company: "Collate",
          applyLink: link,
        });
      }
    });

  const detailedJobs = [];
  for (let job of initialJobs) {
    const description = await fetchJobDescription(job.applyLink);

    // --- NEW STEP: AI CATEGORIZATION ---
    console.log(`Tagging categories for: ${job.title}`);
    
    const aiResponse = await groq.chat.completions.create({
       messages: [
            { 
              role: "system", 
              content: `You are a job categorization expert. Your task is to categorize job descriptions into a structured JSON format
              RULES:
              "Read the job description or job title. Assign it to EXACTLY ONE of these categories: [engineer, devops, data_science, design, data_quality_and_labeling_specialist, quality engineer]
              Rule: 
              - Choose EXACTLY one category.
              - Even if the title says "DevOps Engineer", category = "devops".
              - If it says "Frontend Developer", category = "engineer".
              - Do not explain your reasoning.
              - Return ONLY valid JSON

                JSON SCHEMA:{
                  "primaryCategory": "string" 
                }` 
            },

            // The Real Task
            { 
              role: "user", 
              content: `
                        JOB TITLE: ${job.title}
                        JOB DESCRIPTION:${description}`
            }
          ],
          model: "llama-3.1-8b-instant",
          response_format: { type: "json_object" }
    });


    let category = "general";  
    try {
      const parsed = JSON.parse(aiResponse.choices[0].message.content);
      
      if (parsed.primaryCategory) {
        category = parsed.primaryCategory || "general"; 
      } else {
        category = "general";
      }
    } catch (e) {
      console.error("AI Parsing Error:", e);
      category = ["general"]; 
    }

  // Step 3: Visit each job to get the description
    console.log(`Found ${initialJobs.length} jobs. Fetching descriptions...`);
  
    detailedJobs.push({
      ...job,
      description, // This is what the AI will use!
      category,
      source: "Lever",
      location: "Multiple"
    });

      // Optional: Add a small 500ms delay so you don't get blocked
    await new Promise(resolve => setTimeout(resolve, 500));
  }

  // Step 3: Save to MongoDB (BulkWrite)
  if (detailedJobs.length > 0) {
    const operations = detailedJobs.map(job => ({
      updateOne: {
        filter: { jobId: job.jobId },
        update: { $set: job },
        upsert: true
      }
    }));
    await Job.bulkWrite(operations);
  }

  return detailedJobs.length;
};