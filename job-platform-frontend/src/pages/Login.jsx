import { useState } from "react";
import { login } from "../services/authService";
import { useNavigate } from "react-router-dom";

function Login() {
  const navigate = useNavigate();

  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [message, setMessage] = useState("");

  const handleLogin = async (e) => {
    e.preventDefault();
    const data = await login(email, password);
    setMessage(data.message || "");

    if (data.token) {
      navigate("/profile");
    } else {
      setMessage(data.message || "Login failed");
    }
  };

  return (
    <div style={styles.container}>
      <div style={styles.card}>
        <div style={styles.header}>
          <h2 style={styles.title}>Welcome Back</h2>
          <p style={styles.subtitle}>Log in to access your AI job matches</p>
        </div>

        <form style={styles.form} onSubmit={handleLogin}>
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
            <label style={styles.label}>Password</label>
            <input
              type="password"
              placeholder="••••••••"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              required
              style={styles.input}
            />
          </div>

          <button type="submit" style={styles.button}>
            Sign In
          </button>

          {message && (
            <div style={{
              ...styles.messageBox, 
              backgroundColor: message.includes('success') ? '#f0fdf4' : '#fef2f2',
              color: message.includes('success') ? '#16a34a' : '#dc2626'
            }}>
              {message}
            </div>
          )}
        </form>
        
        <p style={styles.footerText}>
          Don't have an account? <span style={styles.link}>Sign up</span>
        </p>
      </div>
    </div>
  );
}

const styles = {
  container: {
    backgroundColor: '#f8fafc', // Light slate background
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
    boxShadow: '0 4px 6px -1px rgba(0, 0, 0, 0.1), 0 2px 4px -1px rgba(0, 0, 0, 0.06)',
    textAlign: 'center',
  },
  header: {
    marginBottom: '32px',
  },
  title: {
    fontSize: '24px',
    fontWeight: '700',
    color: '#1e293b',
    margin: '0 0 8px 0',
  },
  subtitle: {
    fontSize: '14px',
    color: '#64748b',
    margin: 0,
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
    transition: 'all 0.2s ease',
    outline: 'none',
  },
  button: {
    backgroundColor: '#2563eb', // Modern Blue
    color: 'white',
    padding: '12px',
    borderRadius: '8px',
    border: 'none',
    fontSize: '16px',
    fontWeight: '600',
    cursor: 'pointer',
    transition: 'background-color 0.2s',
    marginTop: '10px',
  },
  messageBox: {
    padding: '12px',
    borderRadius: '8px',
    fontSize: '14px',
    marginTop: '10px',
    border: '1px solid transparent',
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
  }
};

export default Login;
