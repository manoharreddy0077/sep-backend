package com.education.models;

import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

@Entity
public class User  {

    @Id
    @Column(name = "username") // Make sure the column name matches your database schema
    private String username;

    @Column(name = "password") // Make sure the column name matches your database schema
    private String password;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Profile profile;

    // Default constructor
    public User() {
    }

    public User(String username,String password){
        this.username=username;
        this.password=password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='REDACTED'" + // Password should not be included for security reasons
                ", profile=" + (profile != null ? profile.toString() : "null") +
                '}';
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public boolean login(String username,String password){
        // Logic to check login 
        return true; // Placeholder logic
    }
    
    public void logout(){
        // Logic for logout
    }

    // @Override
    // public void updateProfile(){
    //     // Logic to update profile
    //     if (profile != null) {
    //         profile.updateProfile(); // Assuming Profile class also implements IUpdatableProfile
    //     }
    // }

    // @Override
    // public String viewProfile(){
    //     if (profile != null) {
    //         return profile.viewProfile();
    //     }
    //     return null;
    // }
}