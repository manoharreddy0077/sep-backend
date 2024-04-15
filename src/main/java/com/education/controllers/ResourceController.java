package com.education.controllers;

import com.education.models.Resource;
import com.education.repositories.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ResourceController {

    @Autowired
    private ResourceRepository resourceRepository;

    // Method to fetch resources from the database and display resources.jsp page
    @GetMapping("/resources")
    public String showResourcesPage(Model model) {
        // Fetch all resources from the database
        List<Resource> resources = resourceRepository.findAll();
        
        // Add resources to the model
        model.addAttribute("resources", resources);
        
        // Return the name of the JSP file
        return "resources";
    }

    // Add other handler methods as needed for resource-related functionalities
}

