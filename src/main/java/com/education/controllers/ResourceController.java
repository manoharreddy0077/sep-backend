package com.education.controllers;
import com.education.models.SubResource;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/resources")
public class ResourceController {
    
    @GetMapping("/{resourceId}/subresources")
    public List<SubResource> getSubResources(@PathVariable String resourceId) {
        // Logic to fetch sub-resources for a given resource ID
        List<SubResource> subResources = new ArrayList<>();
        // Add logic to retrieve sub-resources from the database or other sources
        return subResources;
    }
}
