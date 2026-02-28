# AI-Powered Career Matcher 🚀

A full-stack job search platform that uses **Machine Learning** and **LLMs** to match candidates with their ideal roles.

## 🧠 AI Features
- **Semantic Vector Search:** Uses `all-MiniLM-L6-v2` to match resumes to jobs based on meaning, not just keywords.
- **Llama 3 Integration:** Connected via **Groq** to provide a real-time matching score (0-100%).
- **PDF Extraction:** Automated text extraction from uploaded resumes.

## 💻 Tech Stack
- **Frontend:** React.js (Modern Styled UI)
- **Backend:** Node.js & Express
- **Database:** MongoDB Atlas (Vector Search Index)
- **Model Provider:** Groq Cloud

## 🛠 Setup
1. Clone the repo.
2. Create a `.env` in the `/backend` folder with your `MONGO_URI` and `GROQ_API_KEY`.
3. Run `npm install` in both folders.
4. Start the backend, then start the frontend.
