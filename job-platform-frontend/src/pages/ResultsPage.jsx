import { useLocation, useNavigate } from "react-router-dom";
import React, { useState } from "react";
import axios from "axios"; // Make sure to install axios
import { generateResume } from "../services/jobMatch";

const ResultsPage = () => {
  const location = useLocation();
  const navigate = useNavigate();
  const [isGenerating, setIsGenerating] = useState(null); // Track which job is being processed

  const jobs = location.state?.jobMatches || [];

  const cardStyle = {
    border: "1px solid #ddd",
    borderRadius: "8px",
    padding: "15px",
    margin: "10px 0",
    backgroundColor: "#f9f9f9",
    boxShadow: "0 2px 4px rgba(0,0,0,0.1)",
    position: "relative"
  };

  const btnStyle = {
    marginTop: "10px",
    padding: "8px 15px",
    backgroundColor: "#007bff",
    color: "white",
    border: "none",
    borderRadius: "4px",
    cursor: "pointer",
    fontWeight: "bold"
  };

  // ✅ NEW FUNCTION: Send job data to AI for resume tailoring
  const handleGenerateResume = async (job, index) => {
    setIsGenerating(index);
    try {
          const data = await generateResume(job);

          if (data.success) {
            // 3. Navigate to display the new resume
            navigate("/custom-resume", { state: { resume: data.customizedResume } });
        }
    } catch (error) {
          console.error("Tailoring Error:", error.message);
          alert("AI was unable to tailor this resume. Please try again.");
    } finally {
      setIsGenerating(null);
    }
  };

  return (
    <>
      <div style={{ padding: "20px" }}>
        <h2>Job Match Results ({jobs.length})</h2>
        
        {jobs.length > 0 ? (
          jobs.map((job, index) => (
            <div key={index} style={cardStyle}>
              <h3>{job.jobTitle || job.title || "Untitled Role"}</h3>
              <p>Company: <strong>{job.company || "Company Name Hidden"}</strong></p>
              <p>Score: <strong style={{ color: "#28a745" }}>{job.matchingScore}%</strong></p>
              
              <div style={{ display: "flex", gap: "10px", marginTop: "10px" }}>
                {job.applyLink && job.applyLink !== "N/A" && (
                  <a href={job.applyLink} target="_blank" rel="noopener noreferrer" style={{ textDecoration: "none" }}>
                    <button style={{ ...btnStyle, backgroundColor: "#6c757d" }}>View Official Posting</button>
                  </a>
                )}

                {/* ✅ THE NEW BUTTON */}
                <button 
                  onClick={() => handleGenerateResume(job, index)}
                  disabled={isGenerating === index}
                  style={btnStyle}
                >
                  {isGenerating === index ? "AI is writing..." : "✨ Generate Tailored Resume"}
                </button>
              </div>
            </div>
          ))
        ) : (
          <div style={{ textAlign: "center" }}>
            <p>No jobs matched your criteria.</p>
            <button onClick={() => navigate(-1)}>Try Different Roles</button>
          </div>
        )}
      </div>

      <button onClick={() => navigate("/profile")} style={{ color: "blue", background: "none", border: "none", cursor: "pointer", textDecoration: "underline", marginLeft: "20px" }}>
        View Profile
      </button>
    </>
  );
};

export default ResultsPage;


