package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.AdminProfile;
import com.feesystem.feesystem.repository.AdminProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adminProfiles")
public class AdminProfileController {

    @Autowired
    private AdminProfileRepository repo;

    @GetMapping
    public List<AdminProfile> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AdminProfile> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/by-name")
    public Optional<AdminProfile> getByName(@RequestParam String fullName) {
        return repo.findByFullName(fullName);
    }

    @PostMapping
    public AdminProfile create(@RequestBody AdminProfile profile) {
        return repo.save(profile);
    }

    @PutMapping("/{id}")
    public AdminProfile update(@PathVariable String id, @RequestBody AdminProfile profile) {
        profile.setId(id);
        return repo.save(profile);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
