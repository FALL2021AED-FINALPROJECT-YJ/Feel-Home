import React, { useState, useEffect } from "react";
import axios from "axios";
import { fetchProfile } from "../services/userProfile";
import { updateProfile } from "../services/userProfile";
import { fetchJobs } from "../services/jobMatch";
import { useNavigate } from "react-router-dom";



// 1. NORMALIZE THESE: These must match the labels your Scraper AI uses
const rolesOptions = [
  { label: "DevOps", value: "devops" },
  { label: "Software Engineer", value: "engineer" },
  { label: "UI Designer", value: "design" },
  { label: "Data Quality Specialist", value: "data quality and labeling specialist" },
  { label: "Data science", value: "data_science" },
  { label: "Quality Engineer", value: "quality engineer" }
];

const Profile = () => {

  const navigate = useNavigate();
  const [loading, setLoading] = useState(false);

  const [userData, setUserData] = useState(null); 
  const [name, setName] = useState("");
  const [number, setNumber] = useState("");
  const [selectedRoles, setSelectedRoles] = useState([]);
  const [resume, setResume] = useState(null); // This stays null until a NEW file is picked

    useEffect(() => {
        const loadProfile = async () => {
          const result = await fetchProfile();    // 'data' is the user object from your backend

          if (result && result.user) {
            const user = result.user; // Extract the user object

            console.log("Found User Roles:", user.selectedRoles);

            // Update all states using the 'user' object directly
            setUserData(user); 
            setName(user.name || "");
            setNumber(user.number || "");
            setSelectedRoles(user.selectedRoles || []);
          }
        }
        
        loadProfile();
      }, []);


      const handleCheckboxChange = (role) => {
        setSelectedRoles(prev => 
        prev.includes(role) ? prev.filter(r => r !== role) : [...prev, role] );
      };


      const handleSave = async (e) => {
        e.preventDefault();
        const formData = new FormData();
        formData.append("name", name);
        formData.append("number", number);
        formData.append("selectedRoles", JSON.stringify(selectedRoles));

        if (resume) {
          formData.append("resume", resume); 
        }

      try {
        const result = await updateProfile(formData);
        console.log("Update successful:", result);

        setUserData(result.user);
        alert("Profile updated successfully!");

        setResume(null); // Clear the "Ready to upload" text
      } catch (err) {
        console.error("Update failed", err);
      }
    };


    // NEW: Function to trigger the AI Match Engine
    const handleShowMatches = async () => {
        if (selectedRoles.length === 0) {
            alert("Please select at least one role first!");
            return;
        }

        // Safety check: ensure resume exists
        if (!userData?.resumePath) {
            alert("Please upload and SAVE your profile/resume before matching!");
            return;
        }

        setLoading(true);

        try {
            const data = await fetchJobs(selectedRoles, userData.resumePath);
            const cleanJobs = data.jobList || [];

            console.log("Navigating with matches:", cleanJobs);
            navigate("/results", { state: { jobMatches: cleanJobs } });
          
        }catch (err) {
            console.error("Matching failed", err);
            alert("Failed to fetch matches. Make sure your Groq API is connected!");
        } finally {
            setLoading(false);
        }
    };


return (
    <div style={styles.container}>
      <form onSubmit={handleSave} style={styles.card}>
        <div style={styles.header}>
          <h2 style={styles.title}>Professional Profile</h2>
          <p style={styles.subtitle}>Update your details and let AI find your next role.</p>
        </div>

        <div style={styles.section}>
          <h3 style={styles.sectionTitle}>Personal Information</h3>
          <div style={styles.inputGroup}>
            <input 
              style={styles.input} 
              type="text" 
              placeholder="Full Name" 
              value={name} 
              onChange={(e) => setName(e.target.value)} 
            />
            <input 
              style={styles.input} 
              type="text" 
              placeholder="Phone Number" 
              value={number} 
              onChange={(e) => setNumber(e.target.value)} 
            />
          </div>
        </div>

        <div style={styles.section}>
          <h3 style={styles.sectionTitle}>Resume Management</h3>
          <div style={styles.uploadBox}>
            {userData?.resumePath ? (
              <div style={styles.currentResume}>
                <span style={{fontSize: '20px'}}>📄</span>
                <a href={`http://localhost:5000/${userData.resumePath}`} target="_blank" rel="noreferrer" style={styles.link}>
                  View Uploaded PDF
                </a>
              </div>
            ) : (
              <p style={styles.noResume}>No resume uploaded yet.</p>
            )}

            <input 
              type="file" 
              name="resume" // Changed 'resume="resume"' to 'name="resume"' for standard compliance
              accept=".pdf" 
              onChange={(e) => setResume(e.target.files[0])} 
              style={styles.fileInput}
            />
            {resume && <p style={styles.readyText}>🚀 Ready to replace: {resume.name}</p>}
          </div>
        </div>

        <div style={styles.section}>
          <h3 style={styles.sectionTitle}>Areas of Interest</h3>
          <div style={styles.rolesGrid}>
            {rolesOptions.map(role => (
              <label key={role.value} style={{
                ...styles.roleLabel,
                backgroundColor: selectedRoles.includes(role.value) ? '#e7f3ff' : '#f8f9fa',
                borderColor: selectedRoles.includes(role.value) ? '#007bff' : '#dee2e6'
              }}>
                <input 
                  type="checkbox" 
                  checked={selectedRoles.includes(role.value)}
                  onChange={() => handleCheckboxChange(role.value)} 
                  style={styles.checkbox}
                />
                {role.label}
              </label>
            ))}
          </div>
        </div>

        <div style={styles.buttonContainer}>
          <button type="submit" style={styles.saveBtn}>Save Profile</button>
          
          <button 
            type="button" 
            onClick={handleShowMatches} 
            style={{...styles.matchBtn, opacity: loading ? 0.7 : 1}} 
            disabled={loading}
          >
            {loading ? (
              <span><span style={styles.spinner}></span> Analyzing with Llama 3...</span>
            ) : "✨ Show My Matching Jobs"}
          </button>
        </div>
      </form>
    </div>
  );
};

// --- SMART STYLES ---
const styles = {
  container: {
    backgroundColor: '#f0f2f5',
    minHeight: '100vh',
    display: 'flex',
    justifyContent: 'center',
    padding: '40px 20px',
    fontFamily: "'Inter', system-ui, sans-serif",
  },
  card: {
    backgroundColor: '#ffffff',
    width: '100%',
    maxWidth: '700px',
    borderRadius: '16px',
    padding: '40px',
    boxShadow: '0 10px 25px rgba(0,0,0,0.05)',
  },
  header: {
    borderBottom: '1px solid #eee',
    marginBottom: '30px',
    paddingBottom: '20px',
  },
  title: {
    margin: 0,
    fontSize: '28px',
    color: '#1a1a1a',
  },
  subtitle: {
    margin: '5px 0 0 0',
    color: '#666',
  },
  section: {
    marginBottom: '35px',
  },
  sectionTitle: {
    fontSize: '18px',
    fontWeight: '600',
    marginBottom: '15px',
    color: '#333',
  },
  inputGroup: {
    display: 'grid',
    gridTemplateColumns: '1fr 1fr',
    gap: '15px',
  },
  input: {
    padding: '12px 15px',
    borderRadius: '8px',
    border: '1px solid #ddd',
    fontSize: '15px',
    outline: 'none',
    transition: 'border-color 0.2s',
  },
  uploadBox: {
    border: '2px dashed #cbd5e0',
    padding: '20px',
    borderRadius: '12px',
    textAlign: 'center',
    backgroundColor: '#f8fafc',
  },
  currentResume: {
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
    gap: '10px',
    marginBottom: '15px',
  },
  link: {
    color: '#007bff',
    textDecoration: 'none',
    fontWeight: '500',
  },
  fileInput: {
    marginTop: '10px',
  },
  readyText: {
    color: '#2b6cb0',
    fontWeight: '500',
    marginTop: '10px',
    fontSize: '14px',
  },
  rolesGrid: {
    display: 'grid',
    gridTemplateColumns: 'repeat(auto-fill, minmax(180px, 1fr))',
    gap: '10px',
  },
  roleLabel: {
    display: 'flex',
    alignItems: 'center',
    padding: '12px',
    borderRadius: '10px',
    border: '1px solid',
    cursor: 'pointer',
    fontSize: '14px',
    transition: 'all 0.2s',
  },
  checkbox: {
    marginRight: '10px',
  },
  buttonContainer: {
    display: 'flex',
    gap: '15px',
    marginTop: '20px',
  },
  saveBtn: {
    flex: 1,
    padding: '14px',
    borderRadius: '10px',
    border: 'none',
    backgroundColor: '#6c757d',
    color: 'white',
    fontWeight: '600',
    cursor: 'pointer',
    transition: 'background 0.2s',
  },
  matchBtn: {
    flex: 2,
    padding: '14px',
    borderRadius: '10px',
    border: 'none',
    backgroundColor: '#007bff',
    color: 'white',
    fontWeight: '600',
    cursor: 'pointer',
    transition: 'transform 0.2s',
  },
  spinner: {
    display: 'inline-block',
    width: '12px',
    height: '12px',
    border: '2px solid rgba(255,255,255,0.3)',
    borderRadius: '50%',
    borderTopColor: '#fff',
    animation: 'spin 1s linear infinite',
    marginRight: '8px',
  }
};

export default Profile;