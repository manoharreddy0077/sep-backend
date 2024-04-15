package com.education.controllers;

import com.education.models.Grade;
import com.education.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;

    @GetMapping("/grades")
    public String displayGrades(Model model) {
        // Fetch grades from the database
        List<Grade> grades = gradeRepository.findAll();
        
        // Add grades to the model
        model.addAttribute("grades", grades);
        
        // Return the name of the JSP file to render
        return "grades";
    }
}
