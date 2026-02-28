export const updateProfile = async(formData) => {
	const response = await fetch("http://localhost:5000/auth/form-data", 
	{
   		method: "PUT", // or POST
    	body: formData, // fetch automatically handles FormData headers
    	credentials: "include"
  	});

    if (!response.ok) throw new Error("Update failed"); // if(400 || 500)
 
    return await response.json();
};

export const fetchProfile = async () => {
	const res = await fetch("http://localhost:5000/auth/user-profile", {
		credentials: "include"
	});
	const data = await res.json();
	console.log("User Data:", data); 
	return data;
};
