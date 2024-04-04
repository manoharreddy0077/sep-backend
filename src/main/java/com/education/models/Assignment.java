package com.education.models;

import java.util.Date;
import org.springframework.web.multipart.MultipartFile;

public class Assignment {
    private String assignmentId;
    private String title;
    private String description;
    private Date dueDate;
    private Grade grade;

    public Assignment(String assignmentId, String title, String description, Date dueDate) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void submitAssignment(String username, MultipartFile assignmentFile) {
        // Logic to submit assignment
    }

    public Assignment viewAssignment() {
        // Logic to view assignment
        return this; // Placeholder implementation
    }
}
