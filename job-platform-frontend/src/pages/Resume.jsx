import React from "react";
import { useLocation, useNavigate } from "react-router-dom";


const Resume = () => {
  const location = useLocation();
  const navigate = useNavigate();
  const resumeText = location.state?.resume;

  if (!resumeText) {
    return (
      <div style={{ padding: "40px", textAlign: "center" }}>
        <h3>No resume data found.</h3>
        <button onClick={() => navigate("/profile")}>Go Profile</button>
      </div>
    );
  }

  return (
    <>
      <div style={{ maxWidth: "800px", margin: "0 auto", padding: "40px" }}>
        <div style={{ display: "flex", justifyContent: "space-between", marginBottom: "20px" }}>
          <h2>✨ Your Tailored Resume</h2>
          <button onClick={() => window.print()} style={downloadBtnStyle}>
            Print to PDF
          </button>
        </div>

        <div style={resumeSheetStyle}>
          {/* This converts the AI's Markdown into clean HTML */}
          <div style={{ whiteSpace: "pre-wrap", fontFamily: "serif" }}>
            {resumeText}
          </div>
        </div>
      </div>
      <div>
        <button onClick={() => navigate("/profile") } style={downloadBtnStyle}> 
          Go Profile 
        </button>
      </div>
    </>
  );

};

// --- STYLES DEFINED OUTSIDE THE COMPONENT ---
const resumeSheetStyle = {
  backgroundColor: "white",
  padding: "40px",
  boxShadow: "0 4px 12px rgba(0,0,0,0.1)",
  borderRadius: "4px",
  lineHeight: "1.6",
  color: "#333",
  fontFamily: "'Segoe UI', Tahoma, Geneva, Verdana, sans-serif"
};

const downloadBtnStyle = {
  padding: "10px 20px",
  backgroundColor: "#0078d4", // Microsoft Blue
  color: "white",
  border: "none",
  borderRadius: "4px",
  cursor: "pointer",
  fontWeight: "bold"
};

export default Resume;