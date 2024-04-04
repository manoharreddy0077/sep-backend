package com.education.models;

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

    public void sendFeedback(Profile profile) {
        // Logic to send feedback to the profile
        profile.addFeedback(this);
    }

    public static void viewPastFeedbacks(Profile profile) {
        // Logic to retrieve and view past feedbacks for the profile
        System.out.println("Past Feedbacks for " + profile.getName() + ":");
        for (Feedback feedback : profile.getPastFeedbacks()) {
            System.out.println("- " + feedback.getMessage());
        }
    }
}
