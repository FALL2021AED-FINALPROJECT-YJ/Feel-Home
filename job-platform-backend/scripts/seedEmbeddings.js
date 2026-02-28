import mongoose from 'mongoose';
import { pipeline } from '@xenova/transformers';
import Job from '../models/Job.js'; // Connect your script to Database



async function run() {
  try {
    // 1. Connect to MongoDB
    await mongoose.connect("mongodb+srv://yashashwini078_db_user:KC7b6LrLvUBhjrZz@cluster0.czrtrfr.mongodb.net/test?retryWrites=true&w=majority&appName=Cluster0");
    console.log("Connected to MongoDB...");

    // 2. Load the Embedding Model
    console.log("Loading model (this takes a moment the first time)...");
    const extractor = await pipeline('feature-extraction', 'Xenova/all-MiniLM-L6-v2');

    // 3. Find jobs that need embeddings
    const jobs = await Job.find({ embedding: { $exists: false } });
    console.log(`Found ${jobs.length} jobs to process.`);

    for (let i = 0; i < jobs.length; i++) {
      const job = jobs[i];
      const text = `${job.title} ${job.description}`;
      
      const output = await extractor(text, { pooling: 'mean', normalize: true });
      job.embedding = Array.from(output.data);
      
      await job.save();
      console.log(`[${i+1}/${jobs.length}] Indexed: ${job.title}`);
    }

    console.log("✅ All jobs that are currently got added are embedded successfully!");
    process.exit(0);
  } catch (err) {
    console.error("❌ Script failed:", err);
    process.exit(1);
  }
}

run();

// const jobs = await Job.find({ embedding: { $exists: false } });
// This is very clever. It means:
// The first time you run it: It processes everything.
// The second time you run it: If you added 50 new jobs yesterday, it will only process those 50 new ones and skip the ones it already did. This saves you a massive amount of time.