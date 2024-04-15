package com.education.controllers;

import com.education.models.Assignment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AssignmentController {

    @GetMapping("/assignments")
    public String showAssignmentPage() {
        return "assignments";
    }
    
    @PostMapping("/submitAssignment")
    public String submitAssignment(@RequestParam("assignmentId") String assignmentId,
                                   @RequestParam("assignmentFile") MultipartFile assignmentFile) {
        // Logic to handle assignment submission
        // Instantiate Assignment object and call submitAssignment method
        Assignment assignment = new Assignment();
        assignment.submitAssignment(assignmentId, assignmentFile);

        // Redirect to assignments page or wherever needed
        return "redirect:/assignments";
    }
}
