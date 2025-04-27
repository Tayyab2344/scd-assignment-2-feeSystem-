package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.GuardianProfile;
import com.feesystem.feesystem.repository.GuardianProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/guardianProfiles")
public class GuardianProfileController {

    @Autowired
    private GuardianProfileRepository repo;

    @GetMapping
    public List<GuardianProfile> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<GuardianProfile> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/by-email")
    public Optional<GuardianProfile> getByEmail(@RequestParam String email) {
        return repo.findByEmail(email);
    }

    @PostMapping
    public GuardianProfile create(@RequestBody GuardianProfile profile) {
        return repo.save(profile);
    }

    @PutMapping("/{id}")
    public GuardianProfile update(@PathVariable String id, @RequestBody GuardianProfile profile) {
        profile.setId(id);
        return repo.save(profile);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
