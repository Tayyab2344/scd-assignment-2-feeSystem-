package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.FeeCategory;
import com.feesystem.feesystem.repository.FeeCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeeCategoryService {

    @Autowired
    private FeeCategoryRepository repo;

    public List<FeeCategory> getAllFeeCategories() {
        return repo.findAll();
    }

    public Optional<FeeCategory> getFeeCategoryById(String id) {
        return repo.findById(id);
    }

    public Optional<FeeCategory> getFeeCategoryByName(String name) {
        return repo.findByName(name);
    }

    public FeeCategory createFeeCategory(FeeCategory category) {
        return repo.save(category);
    }

    public FeeCategory updateFeeCategory(String id, FeeCategory category) {
        category.setId(id);
        return repo.save(category);
    }

    public void deleteFeeCategory(String id) {
        repo.deleteById(id);
    }
}
