package com.education.repositories;

import com.education.models.Profile;
// import com.education.models.User;

// import jakarta.persistence.Tuple;

// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {
    // Add custom query methods if needed
    Profile findByUsername(String username); // Assuming username is a field in the User class

    // Profile save(Profile profile);
}