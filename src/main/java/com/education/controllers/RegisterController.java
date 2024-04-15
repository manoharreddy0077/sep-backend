package com.education.controllers;

import com.education.models.User;
import com.education.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Renders register.jsp
    }

    @PostMapping("/register")
public String register(@RequestParam("username") String username,
                       @RequestParam("password") String password) {

    // Create a new user object
    User user = new User(username, password);

    // Save the user to the database
    userRepository.save(user);

    // Print a message to verify that the registration is successful
    System.out.println("User registered successfully: " + username);

    // Redirect to the login page after successful registration
    return "redirect:/login";
}
}
