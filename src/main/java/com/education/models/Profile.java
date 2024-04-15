package com.education.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Profile")
public class Profile {

    @Id
    @Column(name = "userId") // Adjust if needed to match the column name in the Profile table
    private String user_id; ;

    private String name;
    private String email;
    // private String SRN;
    private int phone_no; // Adjusted to match the database schema
    private int age;

    @OneToOne
    @JoinColumn(name = "userId") // Assuming this is the name of the foreign key column in the Profile table
    private User user;

    @OneToMany(mappedBy = "profile")
    private List<Feedback> pastFeedbacks;

    public Profile(String name, String email, int phone_no, int age) {
        this.name = name;
        // this.SRN = SRN;
        this.email = email;
        this.phone_no = phone_no;
        this.age = age;
        this.pastFeedbacks = new ArrayList<>();
    }
    public Profile() {
        // Required by Hibernate
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getphone_no() {
        return phone_no;
    }

    public void setphone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void updateProfile() {
        // Logic to update the profile
    }

    public String viewProfile() {
        // Logic to view the profile
        StringBuilder profileInfo = new StringBuilder();
        profileInfo.append("Name: ").append(name).append("\n");
        profileInfo.append("Email: ").append(email).append("\n");
        profileInfo.append("Phone Number: ").append(phone_no).append("\n");
        profileInfo.append("Age: ").append(age).append("\n");
        profileInfo.append("Past Feedbacks:\n");
        for (Feedback feedback : pastFeedbacks) {
            profileInfo.append("- ").append(feedback.getMessage()).append("\n");
        }
        return profileInfo.toString();
    }

    public void addFeedback(Feedback feedback) {
        pastFeedbacks.add(feedback);
    }
    
    public List<Feedback> getPastFeedbacks() {
        return pastFeedbacks;
    }

    public void setPastFeedbacks(List<Feedback> pastFeedbacks) {
        this.pastFeedbacks = pastFeedbacks;
    }
}
