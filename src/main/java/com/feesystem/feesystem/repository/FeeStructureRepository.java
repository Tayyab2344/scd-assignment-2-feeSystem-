package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.FeeStructure;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface FeeStructureRepository extends MongoRepository<FeeStructure, String> {
    List<FeeStructure> findByClassroomId(String classroomId);
    List<FeeStructure> findByFeeCategoryId(String feeCategoryId);
}
