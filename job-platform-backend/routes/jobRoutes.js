import express from "express";
import Job from "../models/Job.js"; // fetch from db

const router = express.Router();

router.get("/", async (req, res) => {
  try {
    const jobs = await Job.find({});
    console.log("Fetched from DB:", jobs.length); // THIS should now appear in terminal
    res.json(jobs);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});



//get only user specified jobs
router.get("/my-matched-jobs", async (req, res) => {
try {
	  const user = await User.findById(req.user.id);
	  
	  // Let's say user.selectedRoles is ["Engineer|Devops"]
	  const pattern = user.selectedRoles.join("|"); // result: "Engineer"
	  
	  const jobs = await Job.find({
	    title: { $regex: pattern, $options: "i" } 
	  });
	  
	  // This will find:
	  // 1. "Full Stack Engineer"
	  // 2. "Front End Engineer"
	  // 3. "Software Engineer"
	  res.json(jobs);
	} catch(err) {
		res.status(500).json({ error: error.message });
	}

});


export default router;
