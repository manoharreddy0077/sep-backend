package com.education.models;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String name;
    private String SRN;
    private String email;
    private int phoneNo;
    private int age;
    private List<Feedback> pastFeedbacks;

    public Profile(String name, String SRN, String email, int phoneNo, int age) {
        this.name = name;
        this.SRN = SRN;
        this.email = email;
        this.phoneNo = phoneNo;
        this.age = age;
        this.pastFeedbacks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSRN() {
        return SRN;
    }

    public void setSRN(String SRN) {
        this.SRN = SRN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
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

    public void viewProfile() {
        // Logic to view the profile
        System.out.println("Name: " + name);
        System.out.println("SRN: " + SRN);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("Age: " + age);
        System.out.println("Past Feedbacks:");
        for (Feedback feedback : pastFeedbacks) {
            System.out.println("- " + feedback.getMessage());
        }
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
