package com.education.models;

import java.util.ArrayList;
import java.util.List;

// SubResource class representing the individual sub-resources
public class SubResource {
    private String title;
    private List<SubResource> resources; // Aggregation relationship

    public SubResource(String title) {
        this.title = title;
        this.resources = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubResource> getResources() {
        return resources;
    }

}
