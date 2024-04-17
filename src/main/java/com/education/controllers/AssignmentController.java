package com.education.controllers;

import com.education.models.Assignment;
import com.education.services.AssignmentService;

// import ch.qos.logback.core.model.Model;
import org.springframework.ui.Model;


// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List; 

@Controller
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @GetMapping("/assignments")
    public String showAssignments(Model model) {
        List<Assignment> assignments = assignmentService.getAllAssignments();
        model.addAttribute("assignmentList", assignments);
        System.out.println(assignments);
        return "assignments"; // Renders assignment.jsp
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
