package com.education.controllers;

import com.education.models.Profile;
import com.education.models.User;
import com.education.repositories.ProfileRepository;
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

    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Renders register.jsp
    }

    @PostMapping("/register")
    public String register(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("name") String name,
                           @RequestParam("email") String email,
                           @RequestParam("phone") String phone,
                           @RequestParam("age") int age,
                           @RequestParam("gender") String gender) {
        // Create User object and save it to the database
        User user = new User(username, password);
        userRepository.save(user);
    
        // Create Profile object and save it to the database
        Profile profile = new Profile(username,name, email, phone, age, gender);
        profile.setUsername(username);
        System.out.println(profile);
        profileRepository.save(profile);
    
        // Redirect to login page or wherever appropriate after successful registration
        return "redirect:/login";
    }
}