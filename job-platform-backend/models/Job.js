import mongoose from "mongoose";

const jobSchema = new mongoose.Schema({
  title: String,
  company: String,
  location: String,
  applyLink: String,
  jobId: { 
      type: String, 
      unique: true, 
      sparse: true 
    }, // unique ID
  source: String,
  description: String,
  category: { 
    type: String, 
    index: true, 
    trim: true
  },
  embedding: { type: [Number], default: [] }
}, { timestamps: true });

const Job = mongoose.model("Job", jobSchema);
export default Job;

