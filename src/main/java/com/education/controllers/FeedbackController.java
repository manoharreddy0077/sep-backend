package com.education.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    // @GetMapping("/view/{username}")
    // public Profile viewFeedbacks(@PathVariable String username) {
    //     // Logic to retrieve profile details and past feedbacks based on username
    //     // For example:
    //     User user = /* Retrieve user from service or repository based on username */;
    //     return user.getProfile();
    // }

    // @PostMapping("/submit/{username}")
    // public void submitFeedback(@PathVariable String username, @RequestBody Feedback newFeedback) {
    //     // Logic to submit feedback for the specified username
    //     // For example:
    //     User user = /* Retrieve user from service or repository based on username */;
    //     Profile profile = user.getProfile();
    //     newFeedback.sendFeedback(profile);
    //     // Call a service or repository method to store the new feedback in the database
    // }
}
