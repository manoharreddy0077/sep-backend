package com.education.controllers;

import com.education.models.User;
import com.education.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpdateProfileController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/updateProfile")
    public String showUpdateProfileForm(Model model) {
        // Assuming you have some way to identify the currently logged in user
        String username = "current_logged_in_username"; // Replace this with actual logic to get current user's username
        User user = userRepository.findByUsername(username);
        if (user != null) {
            model.addAttribute("user", user);
            return "update_profile";
        } else {
            // Handle case when user is not found
            return "error"; // You can return an error page or redirect to some other page
        }
    }

    @PostMapping("/saveProfile")
    public String saveProfile(@ModelAttribute("user") User updatedUser) {
        // Assuming you have some way to identify the currently logged in user
        String username = "current_logged_in_username"; // Replace this with actual logic to get current user's username
        User existingUser = userRepository.findByUsername(username);
        if (existingUser != null) {
            // Update existing user's information
            // existingUser.setUsername(updatedUser.getUsername());
            // existingUser.setEmail(updatedUser.getEmail());
            // existingUser.setPhoneNo(updatedUser.getPhoneNo());
            // existingUser.setAge(updatedUser.getAge());
            userRepository.save(existingUser);
            // Redirect to view profile page after updating profile
            return "redirect:/viewProfile";
        } else {
            // Handle case when user is not found
            return "error"; // You can return an error page or redirect to some other page
        }
    }
}
