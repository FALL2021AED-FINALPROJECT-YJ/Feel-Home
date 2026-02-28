import mongoose from 'mongoose';
import { pipeline } from '@xenova/transformers';
import Job from '../models/Job.js';



async function check() {
  await mongoose.connect("mongodb+srv://yashashwini078_db_user:KC7b6LrLvUBhjrZz@cluster0.czrtrfr.mongodb.net/test?retryWrites=true&w=majority&appName=Cluster0");
  
  // 1. Generate a test vector for a common term
  const extractor = await pipeline('feature-extraction', 'Xenova/all-MiniLM-L6-v2');
  const output = await extractor("React Developer", { pooling: 'mean', normalize: true });
  const testVector = Array.from(output.data);

  // 2. Try the search
  try {
    const results = await Job.aggregate([
      {
        "$vectorSearch": {
          "index": "vector_index", // Name must match Atlas!
          "path": "embedding",
          "queryVector": testVector,
          "numCandidates": 10,
          "limit": 5
        }
      },
      {
        "$project": { "title": 1, "score": { "$meta": "vectorSearchScore" } }
      }
    ]);

    if (results.length > 0) {
      console.log("✅ SUCCESS! Vector Search is working.");
      console.table(results);
    } else {
      console.log("⚠️ Vector Search connected, but returned 0 results. Did you run the seed script first?");
    }
  } catch (err) {
    console.error("❌ Vector Search Failed:", err.message);
    console.log("Tip: Check if your Atlas index status is 'Active' and dimensions are 384.");
  }
  process.exit();
}

check();