package com.education.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grades")
public class GradeController {

    @GetMapping("/{assignmentId}")
    public String viewGrade(@PathVariable String assignmentId) {
        // Logic to view grade for the assignment
        // Retrieve grade from service or repository based on assignmentId
        // Grade grade = /* Retrieve grade from service or repository */;
        // return grade.viewGrade();
        return "";
    }
}
