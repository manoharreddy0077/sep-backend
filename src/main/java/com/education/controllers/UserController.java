package com.education.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/users")
public class UserController {
    
    @GetMapping("/login")
    public String login() {
        // Logic to check login credentials
        return "login";
    }
    // @PostMapping("/logout")
    // public void logout(@RequestParam("username") String username) {
    //     // Logic to log out the user
    // // Invalidate user's session or token
    // // Perform other logout-related operations as needed
    // }
    // @GetMapping("/viewProfile")
    // public String viewProfile(@RequestParam("username") String username) {
    //     // logic to view user profile 
    //     return new String();
    // }
    // @PutMapping("updateProfile")
    // public void updateProfile(@RequestParam("username") String username, @RequestBody User updatedUser) {
    //     //Logic to update user profile
    // }
    // @PostMapping("/register")
    // public boolean register(@RequestParam("username") String username , @RequestParam("password") String password , @RequestParam("SRN") String srn,@RequestParam("phnumber") String phnumber) {
    //    // Logic to register a new user
    //     // Create a new User object with provided username and password
    //     // Save the user to the database or perform other registration-related operations
    //     return true; // Return true if registration is successful, false otherwise
    // }
    
}
