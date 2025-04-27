package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.FeeCategory;
import com.feesystem.feesystem.repository.FeeCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feeCategories")
public class FeeCategoryController {

    @Autowired
    private FeeCategoryRepository repo;

    @GetMapping
    public List<FeeCategory> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FeeCategory> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/by-name")
    public Optional<FeeCategory> getByName(@RequestParam String name) {
        return repo.findByName(name);
    }

    @PostMapping
    public FeeCategory create(@RequestBody FeeCategory feeCategory) {
        return repo.save(feeCategory);
    }

    @PutMapping("/{id}")
    public FeeCategory update(@PathVariable String id, @RequestBody FeeCategory feeCategory) {
        feeCategory.setId(id);
        return repo.save(feeCategory);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
