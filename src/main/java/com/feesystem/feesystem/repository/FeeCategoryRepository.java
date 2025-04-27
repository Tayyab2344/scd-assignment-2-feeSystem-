package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.FeeCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface FeeCategoryRepository extends MongoRepository<FeeCategory, String> {
    Optional<FeeCategory> findByName(String name);
}
