package com.education.models;

// import java.util.List;
public class SubResource {
    private String title;
    private String filePath; // File path or URL to the PDF file

    public SubResource(String title, String filePath) {
        this.title = title;
        this.filePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
