package com.education.controllers;

import com.education.models.User;
import com.education.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewProfileController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/viewProfile")
    public String viewProfile(Model model) {
        // Assuming you have some way to identify the currently logged in user
        String username = "current_logged_in_username"; // Replace this with actual logic to get current user's username
        User user = userRepository.findByUsername(username);
        if (user != null) {
            model.addAttribute("user", user);
            return "view_profile";
        } else {
            // Handle case when user is not found
            return "error"; // You can return an error page or redirect to some other page
        }
    }
}
