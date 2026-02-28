import mongoose from 'mongoose';

const userSchema = new mongoose.Schema({
  name: {
    type: String,
    required: [true, "Name is required"],
    trim: true
  },
  email: {
    type: String,
    required: [true, "Email is required"],
    unique: true,
    lowercase: true, // Automatically converts to lowercase
    trim: true
  },
  password: {
    type: String,
    required: [true, "Password is required"],
    minlength: 6
  },
  number: {
    type: String, // Kept as String to handle leading zeros or '+'
    trim: true
  },
  selectedRoles: {
    type: [String], // This defines an Array of Strings
    default: []
  },
  resumePath: {
    type: String, // Stores the file path if you enable uploads later
    default: null
  }
}, { 
  timestamps: true // Adds createdAt and updatedAt automatically
});

const User = mongoose.model('User', userSchema);
export default User;