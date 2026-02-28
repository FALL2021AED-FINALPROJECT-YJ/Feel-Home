import express from "express";
import cors from "cors";
import mongoose from "mongoose";
import cron from 'node-cron';
import cookieParser from 'cookie-parser';
import path from 'path'; // Add this
import { fileURLToPath } from 'url'; // Add this
import Job from "./models/Job.js";
import { runGitHubCrawler } from './crawler.js';

import router from "./routes/auth.js";
import  groqRouter from "./routes/groqRoute.js";
import jobController from "./routes/jobController.js";

// import { scrapeCollateJobs } from "./services/jobScraper.js";


// --- ADD THIS FOR ES MODULE PATHS ---
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

const app = express();
// 1. CORS MUST BE FIRST
app.use(cors({
  origin: "http://localhost:5173", // No trailing slash!
  credentials: true
}));


// --- ADD THIS TO SERVE THE PDF FILES ---
// This allows: http://localhost:5000/uploads/filename.pdf to work
app.use('/uploads', express.static(path.join(__dirname, 'uploads')));

// ... your routes ...
app.use(express.json());
app.use(cookieParser());

// Connect the routes
app.use("/auth", router); // any router inside auth.js should start with /auth (mostlly in fetch localhost/5000/auth/login)

// Optional: get jobs from MongoDB
app.use("/jobs", jobController);    

app.use("/api", groqRouter);



// MongoDB connection
mongoose.connect(
  "mongodb+srv://yashashwini078_db_user:KC7b6LrLvUBhjrZz@cluster0.czrtrfr.mongodb.net/test?retryWrites=true&w=majority&appName=Cluster0"
)
.then(async () => {
    console.log("Connected to MongoDB Atlas!");

    // const result = await Job.deleteMany({});

    runGitHubCrawler();
   // 2. Schedule to run every hour (0th minute of every hour)
      cron.schedule('0 * * * *', () => {
          runGitHubCrawler();
      });
    console.log("⏰ Real-time scheduler active (Runs every hour)");

   // await scrapeCollateJobs();
})
.catch(err => console.log("DB connection error:", err));

// API route to scrape manually
app.get("/api/sync-collate", async (req, res) => {
  try {
    const count = await scrapeCollateJobs();
    res.json({ message: "Collate jobs synced", count });
  } catch (err) {
    console.error(err);
    res.status(500).json({ error: "Failed to sync jobs" });
  }
});



const PORT = 5000;
app.listen(PORT, () => console.log(`Server running on port ${PORT}`));