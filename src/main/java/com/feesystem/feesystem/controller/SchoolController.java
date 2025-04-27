package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.School;
import com.feesystem.feesystem.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    private SchoolRepository repo;

    @GetMapping
    public List<School> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<School> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/by-name")
    public Optional<School> getByName(@RequestParam String name) {
        return repo.findByName(name);
    }

    @PostMapping
    public School create(@RequestBody School school) {
        return repo.save(school);
    }

    @PutMapping("/{id}")
    public School update(@PathVariable String id, @RequestBody School school) {
        school.setId(id);
        return repo.save(school);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
