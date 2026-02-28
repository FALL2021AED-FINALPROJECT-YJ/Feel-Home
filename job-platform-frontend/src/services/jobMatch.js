export const fetchJobs = async(selectedRoles, resume) => {
	const res = await fetch("http://localhost:5000/jobs/match", {
		method : "POST",
		headers : {
				"Content-Type": "application/json"
    	},
    	body: JSON.stringify({ 
      			roles: selectedRoles, 
      			resumePath: resume 
    	}),
    	credentials: "include"
	});

	if (!res.ok) {
	    const errorData = await res.json();
	    throw new Error(errorData.message || "Failed to fetch job matches");
  	}
	return await res.json(); // or const data = res.json();  : data -> {"jobList": [...], "success": true, }
};

export const generateResume = async(job) => {
	const res = await fetch("http://localhost:5000/api/generate-resume", {
		method : "POST",
		headers : {
				"Content-Type": "application/json"
    	},
    	body: JSON.stringify({ 
      			jobData : job
    	}),
    	credentials: "include"
	});

	if (!res.ok) {
	    const errorData = await res.json();
	    throw new Error(errorData.message || "Failed to fetch job matches");
  	}
  	const data = await res.json();
	// Expecting something like: { success: true, customizedResume: "..." }
     return data;
};



