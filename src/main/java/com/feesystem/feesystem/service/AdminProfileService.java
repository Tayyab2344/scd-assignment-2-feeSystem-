package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.AdminProfile;
import com.feesystem.feesystem.repository.AdminProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminProfileService {

    @Autowired
    private AdminProfileRepository repo;

    public List<AdminProfile> getAllAdminProfiles() {
        return repo.findAll();
    }

    public Optional<AdminProfile> getAdminProfileById(String id) {
        return repo.findById(id);
    }

    public Optional<AdminProfile> getAdminProfileByName(String fullName) {
        return repo.findByFullName(fullName);
    }

    public AdminProfile createAdminProfile(AdminProfile profile) {
        return repo.save(profile);
    }

    public AdminProfile updateAdminProfile(String id, AdminProfile profile) {
        profile.setId(id);
        return repo.save(profile);
    }

    public void deleteAdminProfile(String id) {
        repo.deleteById(id);
    }
}
