package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.FeeStructure;
import com.feesystem.feesystem.repository.FeeStructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeeStructureService {

    @Autowired
    private FeeStructureRepository repo;

    public List<FeeStructure> getAllFeeStructures() {
        return repo.findAll();
    }

    public Optional<FeeStructure> getFeeStructureById(String id) {
        return repo.findById(id);
    }

    public List<FeeStructure> getFeeStructuresByClassroom(String classroomId) {
        return repo.findByClassroomId(classroomId);
    }

    public List<FeeStructure> getFeeStructuresByCategory(String feeCategoryId) {
        return repo.findByFeeCategoryId(feeCategoryId);
    }

    public FeeStructure createFeeStructure(FeeStructure structure) {
        return repo.save(structure);
    }

    public FeeStructure updateFeeStructure(String id, FeeStructure structure) {
        structure.setId(id);
        return repo.save(structure);
    }

    public void deleteFeeStructure(String id) {
        repo.deleteById(id);
    }
}
