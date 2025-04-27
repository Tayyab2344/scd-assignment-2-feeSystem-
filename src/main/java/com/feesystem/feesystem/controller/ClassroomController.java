package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.Classroom;
import com.feesystem.feesystem.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classrooms")
public class ClassroomController {

    @Autowired
    private ClassroomRepository repo;

    @GetMapping
    public List<Classroom> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Classroom> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/by-school")
    public List<Classroom> getBySchool(@RequestParam String schoolId) {
        return repo.findBySchoolId(schoolId);
    }

    @PostMapping
    public Classroom create(@RequestBody Classroom classroom) {
        return repo.save(classroom);
    }

    @PutMapping("/{id}")
    public Classroom update(@PathVariable String id, @RequestBody Classroom classroom) {
        classroom.setId(id);
        return repo.save(classroom);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
