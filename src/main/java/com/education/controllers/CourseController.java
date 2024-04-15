package com.education.controllers;

import com.education.models.Course;
import com.education.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public String showCoursesPage(Model model) {
        List<Course> courses = courseRepository.findAll();
        System.out.println("this is the courses    "+courses);
        model.addAttribute("courses", courses);
        return "courses"; // Renders courses.jsp
    }
}
