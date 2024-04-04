package com.education.models;
// Resource class representing the main resource which holds sub-resources
public class Resource {
    private String title;
    private SubResource content; // Aggregation relationship

    public Resource(String title) {
        this.title = title;
        this.content = null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SubResource getContent() {
        return content;
    }

    // Set the content of the resource (single sub-resource)
    public void setContent(SubResource content) {
        this.content = content;
    }

    // View the main resource's content (single sub-resource)
    public SubResource viewResource() {
        return content;
    }
}
