package com.education.controllers;

import com.education.models.Profile;
// import com.education.models.User;
import com.education.models.Feedback;
import com.education.repositories.FeedbackRepository;
import com.education.services.ProfileService;

import jakarta.servlet.http.HttpSession;

// import com.education.repositories.UserRepository;
// import com.education.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class ProfileController {

    // @Autowired
    // private ProfileRepository profileRepository;

    @Autowired
    private ProfileService profileService;

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping("/viewprofile")
    public String viewProfile(Model model, HttpSession session) {
        String username = (String) session.getAttribute("username");
        System.out.println("Username " + username);

        if (username == null) {
            // Handle case where user is not logged in (redirect to login?)
            return "redirect:/login";
        }

        Profile profile = profileService.getProfileByUsername(username);

        System.out.println("Profile in view profile: " + profile);
        // Profile profile = profileOptional.get();
        model.addAttribute("profile", profile);
        return "viewprofile";
        
    }
    
    @GetMapping("/viewpastfeedback")
    public String viewPastFeedback(Model model, HttpSession session) {
       // Retrieve the username from the session
        String username = (String) session.getAttribute("username");

        // Check if the username is present in the session
        if (username == null) {
            // Handle case where user is not logged in (redirect to login?)
            return "redirect:/login";
        }

        // Retrieve past feedbacks associated with the username directly from the repository
        List<Feedback> pastFeedbacks = feedbackRepository.findByUsername(username);
        model.addAttribute("pastFeedbacks", pastFeedbacks);
        System.out.println("Feedbacks:" + pastFeedbacks);
        return "pastfeedback";
    }

    // @GetMapping("/providefeedback")
    // public String showFeedbackPage() {
    //     return "providefeedback";
    // }
    
    @PostMapping("/submitfeedback")    
    public String provideFeedback(String message, HttpSession session) {
        String username = (String) session.getAttribute("username");

        if (username == null) {
            // Redirect to login page or handle unauthorized access
            return "redirect:/login";
        }

        Feedback feedback = new Feedback();
        feedback.setUsername(username);
        feedback.setMessage(message);

        feedbackRepository.save(feedback);

        // Redirect to a confirmation page or wherever appropriate
        return "redirect:/viewpastfeedback";
    }
    
    @GetMapping("/showprofile")
    public String showUpdateProfileForm(HttpSession session, Model model) {
        // Get username from sessionF
        String username = (String) session.getAttribute("username");

        System.out.println("Show profile username: " + username);
        // Retrieve profile from database
        Profile profile = profileService.getProfileByUsername(username);
        System.out.println("Show profile profile: " + profile);
        // Add profile to model
        model.addAttribute("profile", profile);

        return "updateprofile";
    }

    @PostMapping("/updateProfile")
    public String updateProfile(@ModelAttribute("profile") Profile profile) {
        // Update profile in database
        profileService.updateProfile(profile);

        // Redirect to profile view page
        return "redirect:/home";
    }
}