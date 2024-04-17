package com.education.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedback_id;

    @Column(name = "username") // Add this line if it doesn't exist
    private String username;

    @Column(name = "message")
    private String message;
    
    // @ManyToOne
    // @JoinColumn(name = "username") // Assuming this is the name of the foreign key column in the Feedback table
    // private User user; // Change this to User if User represents user information

    public Feedback() {
    }

    public Feedback(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Feedback{" +
            "feedback_id=" + feedback_id +
            ", username='" + username + '\'' +
            ", message='" + message + '\'' +
            '}';
    }
    
    // Getters and setters

    public Long getId() {
        return feedback_id;
    }

    public void setId(Long feedback_id) {
        this.feedback_id = feedback_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}