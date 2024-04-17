package com.education.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @Column(name = "username") // This serves as both primary key and foreign key
    private String username;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
    private String phone_no;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;

    // Constructors, getters, and setters
    // Constructors, getters, and setters
    public Profile() {
    }

    public Profile(String username, String name, String email, String phone_no, int age, String gender) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.phone_no = phone_no;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    // Getters and setters for all fields

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}