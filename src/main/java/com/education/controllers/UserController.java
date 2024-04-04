package com.education.controllers;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;

import com.education.models.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
    
    @PostMapping("login")
    public boolean login(@RequestParam("username") String username , @RequestParam("passowrd") String password) {
        // Logic to check login credentials
        User  user=new User(username,password);
        
        return user.login(username,password);
    }
    @PostMapping("/logout")
    public void logout(@RequestParam("username") String username) {
        // Logic to log out the user
    // Invalidate user's session or token
    // Perform other logout-related operations as needed
    }
    @GetMapping("/viewProfile")
    public String viewProfile(@RequestParam("username") String username) {
        // logic to view user profile 
        return new String();
    }
    @PutMapping("updateProfile")
    public void updateProfile(@RequestParam("username") String username, @RequestBody User updatedUser) {
        //Logic to update user profile
    }
    @PostMapping("/register")
    public boolean register(@RequestParam("username") String username , @RequestParam("password") String password , @RequestParam("SRN") String srn,@RequestParam("phnumber") String phnumber) {
       // Logic to register a new user
        // Create a new User object with provided username and password
        // Save the user to the database or perform other registration-related operations
        return true; // Return true if registration is successful, false otherwise
    }
    

    

    
    
}
