package com.education.models;

import java.util.Date;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.servlet.http.HttpSession;

import java.util.Date;

@Entity
@Table(name = "assignment")
public class Assignment {
    @Id
    private String assignmentId;
    private String title;
    private String description;
    private Date dueDate;
    private Long course_id;


    public Assignment(String assignmentId, String title, String description, Date dueDate) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        // this.course_id=course_id;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId=" + assignmentId +
                ", course=" + course_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                '}';
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

    public void submitAssignment(MultipartFile assignmentFile,String title, HttpSession session) {
        // Check if the assignment file is not empty
        if (!assignmentFile.isEmpty()) {
            try {
                // Get the bytes from the uploaded file
                byte[] bytes = assignmentFile.getBytes();

                // Create directory if it does not exist
                File dir = new File("assignments");
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                // Fetch the username from the HttpSession
                String username = (String) session.getAttribute("username");

                // Construct the file name with username and assignment title
                String fileName = username + "_" + title + ".pdf";

                // Create the file on server
                File serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);
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