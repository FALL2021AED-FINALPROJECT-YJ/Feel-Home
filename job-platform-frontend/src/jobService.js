const API_URL = "http://localhost:5000/jobs";

export const fetchJobs = async () => {
	const response = await fetch(API_URL);
	const data = await response.json();
	console.log("React Data:", data); // Check your BROWSER console (F12) for this
	return data; // This returns the array of 14 jobs to your component
};

export const coverLetter = async (title, description) => {
    const response = await fetch("http://localhost:5000/api/generate-cover-letter", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ title, description })
    });
    return await response.json();
};

