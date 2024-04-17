package com.education.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gradeId;

    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;

    private String grade;

    public Grade() {
    }

    @Override
    public String toString() {
        return "GRADE{" +
                "grade=" + grade +
                ", courseId=" + (course != null ? course.getCourse_id() : null) +
                ", courseName='" + (course != null ? course.getCourse_name() : null) + '\'' +
                '}';
    }

    public Grade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Getter for Course ID
    public Long getCourseId() {
        return course != null ? course.getCourse_id() : null;
    }

    // Getter for Course Name
    public String getCourseName() {
        return course != null ? course.getCourse_name() : null;
    }

    // Setter for Course
    public void setCourse(Course course) {
        this.course = course;
    }

    // Getter for Course
    public Course getCourse() {
        return course;
    }

    // Other methods
    public String viewGrade() {
        return grade;
    }
}
