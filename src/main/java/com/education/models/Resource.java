package com.education.models;

import jakarta.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sub_resource_id", referencedColumnName = "id")
    private SubResource content;

    public Resource() {
        // Default constructor required by JPA
    }

    public Resource(String title) {
        this.title = title;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setContent(SubResource content) {
        this.content = content;
    }

    // View the main resource's content (single sub-resource)
    public SubResource viewResource() {
        return content;
    }
}
