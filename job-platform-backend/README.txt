


🏗️ AI-Powered Job Matching System Architecture
1. Data Acquisition & Storage (The Pipeline)
Automated Scraper: A custom web scraper targets various job boards to extract real-time job postings.

Classification Engine: Postings are automatically categorized by domain (e.g., Quality Engineer, Backend, DevOps) before storage.

Database: Structured job data is stored in MongoDB, ensuring a scalable "schema-less" environment for diverse job descriptions.

2. User Profile & Context Management
Preference Persistence: Users select specific "Areas of Interest" (Roles) and upload their resumes via a React-based frontend.

Data Persistence: User preferences and resume paths are stored in the database, allowing for consistent state management across sessions.

3. Semantic Retrieval & AI Matching (The Core)
Targeted Retrieval (RAG Lite): Instead of processing all jobs, the backend performs a filtered index search in MongoDB to retrieve only the jobs matching the user's selected categories.

Context Injection: The system utilizes a Retrieval-Augmented Generation (RAG) approach, feeding the filtered job descriptions and the parsed resume text into the Llama 3 (via Groq) inference engine.

Semantic Scoring: The AI performs a deep comparison between the candidate's skills/experience and the job requirements, moving beyond simple keyword matching.

4. Intelligent Output & UI Delivery
Structured JSON Extraction: The model is constrained to return a strictly formatted JSON object.

Dynamic Results: The frontend renders a prioritized list of opportunities, including:

Match Score (%): A calculated confidence level of the fit.

Job Title: Targeted position name.

Apply Link: Direct URL to the original posting.



Here is exactly where the "RAG" happens in your code:

1. The "R" (Retrieval)
In a standard AI setup, the model only knows what it was trained on (which is old data). In your code, you are retrieving fresh, real-time data from your own source.

Where: const jobs = await Job.find({ category: { $in: roles } }).limit(20);

Why it’s RAG: You are reaching out to an external data source (MongoDB) to get specific information that the AI doesn't have in its internal memory.

2. The "A" (Augmentation)
This is the most critical part. You are "augmenting" (adding to) the prompt by stuffing that retrieved data into the message you send to Groq.

Where: content: ... Jobs to evaluate: ${JSON.stringify(minimizedJobs)} ...

Why it’s RAG: You are providing "context." You aren't just asking the AI "Find me a job"; you are saying "Look at these specific 20 jobs I found for you and use them to answer my question."

3. The "G" (Generation)
Finally, the AI generates a response based only on the context you provided.

Where: The part where Llama 3 looks at your resume and the jobs you sent, then creates that JSON object with scores.

Why it’s RAG: The output is grounded in the documents you provided, which prevents the AI from hallucinating jobs that don't exist.






