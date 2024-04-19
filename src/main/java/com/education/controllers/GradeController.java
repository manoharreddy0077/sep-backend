package com.education.controllers;

import com.education.models.Grade;
import com.education.repositories.GradeRepository;
import com.education.repositories.UserRepository;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/grades")
    public String displayGrades(Model model,HttpSession  session) {
        // Get the username from the session
        String username = (String) session.getAttribute("username");
        System.out.println("Show profile username: " + username);
        
        // Fetch grades for the logged-in user
        List<Grade> grades = gradeRepository.findByUserUsername(username);
        System.out.println(grades);
        
        // Add grades to the model
        model.addAttribute("grades", grades);
        
        // Return the name of the HTML template file to render
        return "grades"; // Assuming Thymeleaf is used, so the file should be grades.html
    }
}
