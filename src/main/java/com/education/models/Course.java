package com.education.models;

// import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_id;

    private String course_name;
    private String instructor_name;

    @OneToMany(mappedBy = "course")
    private List<Grade> grades;

    // Constructor, getters, setters, and other methods

    public Course(String course_name, String instructor_name) {
        this.course_name = course_name;
        this.instructor_name = instructor_name;
    }
    public Course(){

    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getInstructor_name() {
        return instructor_name;
    }
    @Override
public String toString() {
    return "Course{" +
            "course_id=" + course_id +
            ", course_name='" + course_name + '\'' +
            ", instructor_name='" + instructor_name + '\'' +
            '}';
}


    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public String viewCourseDescription() {
        return "Course Description"; // Placeholder implementation
    }
}
