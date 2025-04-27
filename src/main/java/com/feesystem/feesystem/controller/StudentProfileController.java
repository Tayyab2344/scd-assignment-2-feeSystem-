package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.StudentProfile;
import com.feesystem.feesystem.repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentProfiles")
public class StudentProfileController {

    @Autowired
    private StudentProfileRepository repo;

    @GetMapping
    public List<StudentProfile> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<StudentProfile> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/by-admission")
    public Optional<StudentProfile> getByAdmission(@RequestParam String admissionNumber) {
        return repo.findByAdmissionNumber(admissionNumber);
    }

    @GetMapping("/by-classroom")
    public List<StudentProfile> getByClassroom(@RequestParam String classroomId) {
        return repo.findByClassroomId(classroomId);
    }

    @PostMapping
    public StudentProfile create(@RequestBody StudentProfile profile) {
        return repo.save(profile);
    }

    @PutMapping("/{id}")
    public StudentProfile update(@PathVariable String id, @RequestBody StudentProfile profile) {
        profile.setId(id);
        return repo.save(profile);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
