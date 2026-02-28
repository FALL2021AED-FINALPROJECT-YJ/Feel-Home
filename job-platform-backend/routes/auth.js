import express from "express";
import bcrypt from "bcrypt";
import User from "../models/User.js"; 
import jwt from "jsonwebtoken";
import multer from 'multer';
import path from 'path';
import fs from 'fs';
import { fileURLToPath } from 'url';
// import jobRouter from "./routes/jobRoutes.js";
const router = express.Router();

// --- ES MODULE DIRECTORY SETUP ---
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);


const uploadDir = path.resolve(__dirname, '..', 'uploads');

// 1. Create an ABSOLUTE path to the uploads folder
// This joins your current folder path with 'uploads'
if (!fs.existsSync(uploadDir)) {
    fs.mkdirSync(uploadDir, { recursive: true });
    console.log("✅ Created 'uploads' directory");
}

// --- MULTER CONFIGURATION ---
const storage = multer.diskStorage({
  destination: (req, file, cb) => {
    // 3. Use the absolute path here
    cb(null, uploadDir); 
  },
  filename: (req, file, cb) => {
    cb(null, Date.now() + '-' + file.originalname);
  }
});

export const upload = multer({ storage: storage });


// REGISTER NEW USER
router.post("/register", async (req, res) => {
  const { email, password } = req.body;

  try {
    // Check if user already exists
    console.log("register router.....");
    const existingUser = await User.findOne({ email });
    if (existingUser) return res.status(400).json({ message: "User already exists" });

    // Hash the password
    const hashedPassword = await bcrypt.hash(password, 10);

    // Create new user
    const newUser = new User({ email, password: hashedPassword });
    await newUser.save();

    res.status(201).json({ message: "User registered successfully" });
  } catch (err) {
    console.error(err);
    res.status(500).json({ message: "Server error" });
  }
});


router.post("/login", async (req, res) => {
  const { email, password } = req.body;

  try {
    // 1. Check if user exists
    const user = await User.findOne({ email });
    if (!user) {
      return res.status(400).json({ message: "User not found" });
    }

    // 2. Compare password
    const isMatch = await bcrypt.compare(password, user.password);
    if (!isMatch) {
      return res.status(400).json({ message: "Invalid credentials" });
    }

    // 3. Create JWT token
    const token = jwt.sign(
      { userId: user._id },
      "secretkey123", // later we move this to env
      { expiresIn: "1h" }
    );

    // Inside your login route (auth.js)
    res.cookie("userEmail", user.email, {
      httpOnly: true,     // Prevents JavaScript from reading the cookie (Secure!)
      secure: false,      // Set to true in production (HTTPS)
      maxAge: 24 * 60 * 60 * 1000,    // 1 hour in milliseconds
      sameSite: "lax",
    });

    res.json({
      message: "Login successful",
      email: user.email, // Send this back!
      token,
    });
  } catch (err) {
    console.error(err);
    res.status(500).json({ message: "Server error" });
  }
});


// save user formData
router.put("/form-data", upload.single("resume"), async(req, res ) => {
  try {
        // 1. Extract text data from req.body
      const { name, number, selectedRoles } = req.body;
      console.log("Body content:", req.body);

      const rawEmail = req.cookies.userEmail; //pick email from cookie

      if (!rawEmail) return res.status(401).json({ message: "No cookie found" });

      const email = decodeURIComponent(rawEmail);
      console.log("email decoded ::", email);


        // 2. Prepare the update object
      const updateData = {};
      if (name) updateData.name = name;
      if (number) updateData.number = number;
     if (selectedRoles) {
      updateData.selectedRoles = JSON.parse(selectedRoles); // You MUST parse the array back from the string.
    }

      // 3. Handle the File (if provided)
      if (req.file) {
      // Save ONLY the filename or a relative path, not the absolute system path
        updateData.resumePath = `uploads/${req.file.filename}`; 
        console.log("Multer File Object:", req.file);   
      }else{
        console.log("No file was uploaded");
      }                                    

      // 4. Find user by ID (req.user.id comes from your protect/auth middleware)
      const updatedUser = await User.findOneAndUpdate(
        { email: email }, // Filter
        { $set: updateData }, // Data to change
        { new: true, runValidators: true } // Options: return the updated doc
      );


      if (!updatedUser) {
        return res.status(404).json({ message: "User with this email not found" });
      }else{
          console.log("Updated ");
      }

      res.status(200).json({
        success: true,
        message: "Profile updated successfully",
        user: updatedUser
      });
    }catch (error) {
        console.error(error);
        res.status(500).json({ message: "Server Error", error: error.message });
    }
});


//load user details
router.get("/user-profile", async(req, res) => {
   // Automatically populated by cookie-parser
  try {
        const rawEmail = req.cookies.userEmail;

        if (!rawEmail) return res.status(401).json({ message: "No cookie found" });

        const email = decodeURIComponent(rawEmail);
        const existingEmail = await User.findOne({ email });

        if (!existingEmail) return res.status(401).json({ message: "Not authenticated" });
      
        const user = await User.findOne({ email }).select("-password");
        console.log("found user from database", JSON.stringify(user));

        return res.json({ user });

    }catch (error){
        console.error(error);
        res.status(500).json({ message: "Server Error", error: error.message });
    }
});




export default router;