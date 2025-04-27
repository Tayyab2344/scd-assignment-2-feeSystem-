package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.FeeStructure;
import com.feesystem.feesystem.repository.FeeStructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feeStructures")
public class FeeStructureController {

    @Autowired
    private FeeStructureRepository repo;

    @GetMapping
    public List<FeeStructure> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FeeStructure> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/by-classroom")
    public List<FeeStructure> getByClassroom(@RequestParam String classroomId) {
        return repo.findByClassroomId(classroomId);
    }

    @GetMapping("/by-category")
    public List<FeeStructure> getByCategory(@RequestParam String feeCategoryId) {
        return repo.findByFeeCategoryId(feeCategoryId);
    }

    @PostMapping
    public FeeStructure create(@RequestBody FeeStructure feeStructure) {
        return repo.save(feeStructure);
    }

    @PutMapping("/{id}")
    public FeeStructure update(@PathVariable String id, @RequestBody FeeStructure feeStructure) {
        feeStructure.setId(id);
        return repo.save(feeStructure);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
