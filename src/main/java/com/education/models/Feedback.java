package com.education.models;

import java.util.List;

public class Feedback {
    private String message;

    public Feedback(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sendFeedback(User user, String message) {
        // Logic to send feedback to the user
    }

    public List<Feedback> viewPastFeedbacks(User user) {
        // Logic to retrieve and return a list of past feedbacks for the user
        return null;
    }
}
