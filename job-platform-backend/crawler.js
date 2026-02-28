import axios from 'axios';
import mongoose from 'mongoose';
import  Job  from './models/Job.js';
import fetch from "node-fetch";
import { load } from "cheerio"; // ✅ often cleaner
import { Groq } from "groq-sdk";


const groq = new Groq({
  apiKey: "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" 
});


const REPO_API = "https://api.github.com/repos/speedyapply/2026-SWE-College-Jobs/contents/";

const sleep = (ms) => new Promise(resolve => setTimeout(resolve, ms));

export async function runGitHubCrawler() {
    try {
       console.log("🚀 Starting GitHub Crawl...");

           // 1. Get file list from GitHub
        const res = await fetch(REPO_API, { headers: { "User-Agent": "JobBot/1.0" } });
        const files = await res.json(); // return json objects where type: file 


    // 2. Filter: Only process README and markdown files or files that DO NOT have "INTL" in the name
        const usaFiles = files.filter(f => {
            const name = f.name.toUpperCase();
            return name.endsWith('.MD') && !name.includes('INTL');
        });

        console.log(`🇺🇸 Found ${usaFiles.length} USA-related files to process.`); // 2 files

        for (const file of usaFiles) {
            console.log(`📂 Processing file: ${file.name}`);

            const fileRes = await fetch(file.download_url); // file.calls raw URL download url link sends req to get data
            const content = await fileRes.text();

            // 2. Parse the Markdown into job objects
            const jobsFromRepo = parseMarkdown(content);
            console.log(`📂 Parsed the json`,  jobsFromRepo);

            for (let job of jobsFromRepo) {

                // STEP 1: Check if the job is already in the DB
                const existingJob = await Job.findOne({ applyLink: job.applyLink });

                if (existingJob) {
                // console.log(`⏩ Skipping ${job.company} (Already exists)`);
                    continue; 
                }
                
                // --- AI CATEGORIZATION ---
                // Since we don't have full descriptions in the GitHub table, 
                // we ask AI to categorize based on the Title + Company
                const category = await getAICategory(job.title, job.company);

                // 3. Prepare for Database (Upsert)
                await Job.updateOne(
                { 
                    applyLink: job.applyLink }, // Use link as unique ID
                    { 
                        $set: {
                          ...job,
                          category,
                          source: "GitHub_Repo",
                          lastUpdated: new Date()
                        } 
                    },
                    { upsert: true }
                );

                await sleep(2100);
            }
        }

    console.log("✅ GitHub Sync & AI Categorization Complete.");
  } catch (error) {
    console.error("❌ Crawler Error:", error);
  }
};


// Helper: AI Categorization Logic
async function getAICategory(title, company) {
  try {
    const aiResponse = await groq.chat.completions.create({
      messages: [
        { 
          role: "system", 
          content: `Categorize the job title into EXACTLY ONE: [engineer, devops, data_science, design, quality engineer]. Return ONLY JSON: {"primaryCategory": "string"}` 
        },
        { role: "user", content: `JOB TITLE: ${title} at ${company}` }
      ],
      model: "llama-3.1-8b-instant",
      response_format: { type: "json_object" }
    });

    const parsed = JSON.parse(aiResponse.choices[0].message.content);
    return parsed.primaryCategory || "engineer";
  } catch (e) {
    return "engineer"; // Default fallback
  }
}    

//parse logic for company | title | applylink
function parseMarkdown(text) {
  const lines = text.split('\n');
  const results = [];

  lines.forEach(line => {
    // 1. Identify valid data rows
    if (line.trim().startsWith('|') && !line.includes('---') && !line.toLowerCase().includes('company')) {
      
      // 2. Split into columns (keep empty columns so the index is predictable)
      const cols = line.split('|').map(c => c.trim());
      // After splitting '| A | B |', cols becomes ['', ' A ', ' B ', '']
      // We filter empty first/last elements or just handle indices carefully
      const cleanCols = cols.filter((val, index) => index > 0 && index < cols.length - 1);

      if (cleanCols.length >= 3) {
        // 3. TARGET THE LINK COLUMN (Usually the last one)
        const applyCol = cleanCols[cleanCols.length - 1]; 
        const linkMatch = applyCol.match(/https?:\/\/[^\s)]+/);

        results.push({
          company: cleanCols[0]
          .replace(/<[^>]*>/g, '')      // Remove <tags>
          .replace(/\[|\]|\*\*/g, '')   // Remove [ ] and **
          .split('(')[0]                // Take text before (URL)
          .trim(),

          title: cleanCols[1]
          .replace(/<[^>]*>/g, '')
          .replace(/\[|\]|\*\*/g, '')
          .trim(),

          applyLink: (line.match(/https?:\/\/[^\s"'>)]+/) || ["N/A"])[0],

          location: cleanCols[2] || "USA"
        });
      }
    }
  });

  return results; 
}
