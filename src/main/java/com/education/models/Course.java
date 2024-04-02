package com.education.models;

// import com.education.models.User;

public class Course {
    private String courseID;
    public String courseName;
    public String instructorName;
    private Assignment assignment;

    public Course(String courseId,String courseName,String instructorName){
        this.courseID=courseId;
        this.courseName=courseName;
        this.instructorName=instructorName;
    }


    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    
    public String getCourseId(){
        return courseID;
    }
    public void setCourseId(String courseID){
        this.courseID=courseID;
    }
    public String getCourseName(){
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
    
    public boolean enroll(String username,String CourseName){
        // coursename not a parameter in class diagram 
        return true;
    }
    public String viewCourseDescription(){
        return "Course DESC";
    }

}
