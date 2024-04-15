package com.education.controllers;

import com.education.models.User;
import com.education.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Mapping for the initial login page
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // This will render login.jsp
    }

    @PostMapping("/login")
    public ModelAndView login(@RequestParam String username, @RequestParam String password) {
        ModelAndView modelAndView = new ModelAndView();
        // Check if the provided username and password match any records in the database
        User user = userRepository.findByUsernameAndPassword(username, password);
        if (user != null) {
            // Redirect to the homepage if login is successful
            modelAndView.setViewName("redirect:/home");
        } else {
            // Add an error message to the model and redirect back to the login page
            modelAndView.setViewName("redirect:/login");
            modelAndView.addObject("error", "Invalid username or password");
        }
        return modelAndView;
    }
    @GetMapping("/home")
    public String homePage() {
        return "home"; // This will render home.jsp
    }
}
