import React, { useEffect, useState } from "react";
import { fetchJobs } from "../services/jobService.js";
import { coverLetter} from "../services/jobService.js";


const JobList = () => {
  const [jobs, setJobs] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const loadJobs = async () => {
      try {
        const data = await fetchJobs(); // Call the service function
        setJobs(data);
      } catch (err) {
        console.error("Failed to fetch jobs:", err);
      } finally {
        setLoading(false);
      }
    };

    loadJobs(); //when JobList component is being mounted useEffect run loadJobs
  }, []);


  const [selectedLetter, setSelectedLetter] = useState("");

  const generateLetter = async(job) => {
      setSelectedLetter("Writing your letter... please wait...");

    try
      {
      // 2. Ensure coverLetter is a function that calls your API
        const data = await coverLetter(job.title, job.description);
        setSelectedLetter(data.letter);
      } catch(err){
       setSelectedLetter("Error generating letter. Try again.");
    }
  };




  if (loading) return <p>Loading jobs...</p>;
  if (jobs.length === 0) return <p>No jobs found.</p>;

  return (
    <div style={{ padding: "20px" }}>
      <h2>Job Listings</h2>

      {/* 1. Show the Generated Letter at the top if it exists */}
      {selectedLetter && (
        <div style={{ 
          background: "#f9f9f9", 
          padding: "20px", 
          border: "1px solid #6200ee", 
          borderRadius: "8px",
          marginBottom: "20px" 
        }}>
          <h3>Generated Cover Letter</h3>
          <pre style={{ whiteSpace: "pre-wrap", fontSize: "14px" }}>{selectedLetter}</pre>
          <button onClick={() => setSelectedLetter("")}>Clear / Close</button>
        </div>
      )}

      <ul>
        {jobs.map((job, index) => (
          <li key={index} style={{ marginBottom: "20px", listStyle: "none", borderBottom: "1px solid #eee", paddingBottom: "10px" }}>
            <strong>{job.title}</strong> - {job.company} <br />
            Location: {job.location} <br />
            Source: {job.source} <br />
            
            <div style={{ marginTop: "10px" }}>
              {/* The Link to the job */}
              <a href={job.applyLink} target="_blank" rel="noopener noreferrer" style={{ marginRight: "15px" }}>
                Apply
              </a>

              {/* 2. The AI Button */}
              <button 
                onClick={() => generateLetter(job)}
                style={{ cursor: "pointer", background: "#6200ee", color: "white", border: "none", borderRadius: "4px", padding: "5px 10px" }}
              >
                Generate Cover Letter ✍️
              </button>
            </div>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default JobList;