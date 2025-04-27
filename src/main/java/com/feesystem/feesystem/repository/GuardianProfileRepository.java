package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.GuardianProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface GuardianProfileRepository extends MongoRepository<GuardianProfile, String> {
    Optional<GuardianProfile> findByEmail(String email);
}
