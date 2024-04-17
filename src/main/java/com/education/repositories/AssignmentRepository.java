package com.education.repositories;

import com.education.models.Assignment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentRepository   extends JpaRepository <Assignment, String>{

    // Save or update an assignment
    // Assignment save(Assignment assignment);
    // Retrieve all assignments
    List<Assignment> findAll();

    // Add other custom methods as needed for your application
}
