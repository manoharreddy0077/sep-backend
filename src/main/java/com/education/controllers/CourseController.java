package com.education.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
// import org.springframework.web.multipart.MultipartFile;

@Controller
// @RequestMapping("/courses")
public class CourseController {

    @GetMapping("/courses")
    public String showCoursesPage() {
        return "courses"; // Renders courses.jsp
    }
    // @GetMapping("/{courseId}")
    // public String getCourseDetails(@PathVariable String courseId) {
    //     // Logic to fetch course details by courseId
    //     // Course course = Retrieve course from service or repository based on courseId;
    //     // return course.viewCourseDescription();
    //     return "Course details"; // Placeholder
    // }

    // @GetMapping("/{courseId}/assignments/{assignmentId}")
    // public String viewAssignment(@PathVariable String courseId, @PathVariable String assignmentId) {
    //     // Logic to view assignment details
    //     // Course course = Retrieve course from service or repository based on courseId;
    //     // Assignment assignment = course.getAssignmentById(assignmentId);
    //     // return assignment.getDescription();
    //     return "Assignment details"; // Placeholder
    // }

    // @PostMapping("/{courseId}/assignments/submit")
    // public void submitAssignment(@PathVariable String courseId,
    //                               @RequestParam("username") String username,
    //                               @RequestParam("assignmentId") String assignmentId,
    //                               @RequestParam("solution") MultipartFile solutionFile) {
    //     // Logic to submit assignment for a course
    //     // Course course = Retrieve course from service or repository based on courseId;
    //     // Convert MultipartFile to byte array or store it as required
    //     // byte[] solutionBytes = solutionFile.getBytes();
    //     // course.submitAssignment(username, assignmentId, solutionBytes);
    // }
}
