package com.education.models;
import java.util.List;
import java.util.ArrayList;

public class Resource {
    private String title;
    private List<SubResource> subResources;

    public Resource(String title) {
        this.title = title;
        this.subResources = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubResource> getSubResources() {
        return subResources;
    }

    public void setSubResources(List<SubResource> subResources) {
        this.subResources = subResources;
    }

    public void addSubResource(SubResource subResource , Resource resource) {
        if (this.equals(resource)) {
            this.subResources.add(subResource);
        } else {
            System.out.println("Cannot add subresource to a different resource.");
        }
    }
}
