package com.education.models;


public class Course {
    private String courseId;
    private String courseName;
    private String instructorName;
    private Assignment assignment;

    public Course(String courseId, String courseName, String instructorName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public String viewCourseDescription() {
        return "Course Description"; // Placeholder implementation
    }
}
