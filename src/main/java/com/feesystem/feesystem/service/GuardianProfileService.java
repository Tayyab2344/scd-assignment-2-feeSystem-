package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.GuardianProfile;
import com.feesystem.feesystem.repository.GuardianProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuardianProfileService {

    @Autowired
    private GuardianProfileRepository repo;

    public List<GuardianProfile> getAllGuardianProfiles() {
        return repo.findAll();
    }

    public Optional<GuardianProfile> getGuardianProfileById(String id) {
        return repo.findById(id);
    }

    public Optional<GuardianProfile> getGuardianProfileByEmail(String email) {
        return repo.findByEmail(email);
    }

    public GuardianProfile createGuardianProfile(GuardianProfile profile) {
        return repo.save(profile);
    }

    public GuardianProfile updateGuardianProfile(String id, GuardianProfile profile) {
        profile.setId(id);
        return repo.save(profile);
    }

    public void deleteGuardianProfile(String id) {
        repo.deleteById(id);
    }
}
