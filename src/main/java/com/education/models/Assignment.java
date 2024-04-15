package com.education.models;

import java.util.Date;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;


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

    public Assignment() {
        // Default initialization if needed
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

    public void submitAssignment(String assignmentId, MultipartFile assignmentFile) {
        // Check if the assignment file is not empty
        if (!assignmentFile.isEmpty()) {
            try {
                // Get the bytes from the uploaded file
                // byte[] bytes = assignmentFile.getBytes();

                // Create directory if it does not exist
                File dir = new File("assignments");
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                // Create the file on server
                File serverFile = new File(dir.getAbsolutePath() + File.separator + assignmentId + ".pdf");
                // Save the uploaded file to the server
                assignmentFile.transferTo(serverFile);

                // Now you can do further processing like updating the database or sending notifications
                System.out.println("Assignment submitted successfully.");

            } catch (IOException e) {
                System.out.println("Failed to submit assignment: " + e.getMessage());
            }
        } else {
            System.out.println("Assignment file is empty.");
        }
    }

    public Assignment viewAssignment() {
        // Logic to view assignment
        return this; // Placeholder implementation
    }
}
