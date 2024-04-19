package com.education.services;


import com.education.models.Assignment;
import com.education.repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }

    public Assignment getAssignmentById(String assignmentId) {
        Optional<Assignment> optionalAssignment = assignmentRepository.findById(assignmentId);
        return optionalAssignment.orElse(null);
    }
}