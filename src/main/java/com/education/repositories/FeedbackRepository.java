package com.education.repositories;

import com.education.models.Feedback;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    // Add custom query methods if needed
    List<Feedback> findByUsername(String username);
}