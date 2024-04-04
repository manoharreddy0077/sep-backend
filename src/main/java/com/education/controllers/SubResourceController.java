package com.education.controllers;

import com.education.models.SubResource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subresources")
public class SubResourceController {

    @GetMapping("/{subResourceId}")
    public SubResource viewSubResource(@PathVariable String subResourceId) {
        // Logic to fetch a sub-resource by ID
        return new SubResource("Sample SubResource");
    }

}
