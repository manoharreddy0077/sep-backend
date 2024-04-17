package com.education.services;

import com.education.models.Profile;
import com.education.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile getProfileByUsername(String username) {
        return profileRepository.findByUsername(username);
    }

    public void updateProfile(Profile newProfile) {
        
        Profile existingProfile = profileRepository.findByUsername(newProfile.getUsername());
        existingProfile.setName(newProfile.getName());
        existingProfile.setEmail(newProfile.getEmail());
        existingProfile.setphoneNo(newProfile.getphoneNo());
        existingProfile.setAge(newProfile.getAge());
        existingProfile.setGender(newProfile.getGender());

        // Save the updated profile
        profileRepository.save(existingProfile);
    }
}