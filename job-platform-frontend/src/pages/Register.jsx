import { useState } from "react";
import { register } from "../services/authService";
import { useNavigate } from "react-router-dom";

function Register() {
  const navigate = useNavigate();

  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [message, setMessage] = useState("");

  const handleRegister = async (e) => {
    e.preventDefault();

    try {
      const data = await register(email, password);
      console.log("Register response:", data);

      setMessage(data.message || "");

      if (
        data.message &&
        data.message.toLowerCase().includes("registered successfully")
      ) {
        navigate("/login");
      } 
      else if (
        data.message &&
        data.message.toLowerCase().includes("already exists")
      ) {
        setTimeout(() => navigate("/login"), 1000);
      }

    } catch (err) {
      setMessage("Registration failed. Please try again.");
      console.error(err);
    }
  };

  return (
    <div style={styles.container}>
      <div style={styles.card}>
        <div style={styles.header}>
          <h2 style={styles.title}>Create Account</h2>
          <p style={styles.subtitle}>Join the AI-powered job search revolution</p>
        </div>

        <form style={styles.form} onSubmit={handleRegister}>
          <div style={styles.inputWrapper}>
            <label style={styles.label}>Email Address</label>
            <input
              type="email"
              placeholder="name@company.com"
              value={email}
              onChange={(e) => setEmail(e.target.value)}
              required
              style={styles.input}
            />
          </div>

          <div style={styles.inputWrapper}>
            <label style={styles.label}>Create Password</label>
            <input
              type="password"
              placeholder="Min. 8 characters"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              required
              style={styles.input}
            />
          </div>

          <button type="submit" style={styles.button}>
            Create Account
          </button>

          {message && (
            <div style={{
              ...styles.messageBox, 
              backgroundColor: message.toLowerCase().includes('success') || message.toLowerCase().includes('exists') ? '#f0fdf4' : '#fef2f2',
              color: message.toLowerCase().includes('success') || message.toLowerCase().includes('exists') ? '#16a34a' : '#dc2626',
              borderColor: message.toLowerCase().includes('success') || message.toLowerCase().includes('exists') ? '#bbf7d0' : '#fecaca'
            }}>
              {message}
            </div>
          )}
        </form>
        
        <p style={styles.footerText}>
          Already have an account? <span onClick={() => navigate("/login")} style={styles.link}>Log in</span>
        </p>
      </div>
    </div>
  );
}

const styles = {
  container: {
    backgroundColor: '#f8fafc',
    height: '100vh',
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
    fontFamily: "'Inter', system-ui, sans-serif",
  },
  card: {
    backgroundColor: '#ffffff',
    width: '100%',
    maxWidth: '400px',
    padding: '40px',
    borderRadius: '16px',
    boxShadow: '0 10px 25px rgba(0, 0, 0, 0.05)',
    textAlign: 'center',
  },
  header: {
    marginBottom: '32px',
  },
  title: {
    fontSize: '26px',
    fontWeight: '700',
    color: '#1e293b',
    margin: '0 0 8px 0',
  },
  subtitle: {
    fontSize: '14px',
    color: '#64748b',
    margin: 0,
    lineHeight: '1.5',
  },
  form: {
    display: 'flex',
    flexDirection: 'column',
    gap: '20px',
  },
  inputWrapper: {
    textAlign: 'left',
  },
  label: {
    display: 'block',
    fontSize: '13px',
    fontWeight: '600',
    color: '#475569',
    marginBottom: '6px',
  },
  input: {
    width: '100%',
    padding: '12px',
    borderRadius: '8px',
    border: '1px solid #e2e8f0',
    fontSize: '15px',
    boxSizing: 'border-box',
    outline: 'none',
    transition: 'border-color 0.2s',
  },
  button: {
    backgroundColor: '#2563eb', // Brand Blue
    color: 'white',
    padding: '14px',
    borderRadius: '8px',
    border: 'none',
    fontSize: '16px',
    fontWeight: '600',
    cursor: 'pointer',
    marginTop: '10px',
    transition: 'background-color 0.2s',
  },
  messageBox: {
    padding: '12px',
    borderRadius: '8px',
    fontSize: '14px',
    marginTop: '10px',
    border: '1px solid',
  },
  footerText: {
    marginTop: '24px',
    fontSize: '14px',
    color: '#64748b',
  },
  link: {
    color: '#2563eb',
    fontWeight: '600',
    cursor: 'pointer',
    textDecoration: 'none',
  }
};

export default Register;