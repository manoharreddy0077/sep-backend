package com.education.repositories;

import com.education.models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findByUserUsername(String username); // Change the method name to match the property name in the Grade entity
    // You can add custom query methods if needed
}
