package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.AdminProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface AdminProfileRepository extends MongoRepository<AdminProfile, String> {
    Optional<AdminProfile> findByFullName(String fullName);
}
