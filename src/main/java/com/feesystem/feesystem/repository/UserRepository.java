package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.User;
import com.feesystem.feesystem.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
    List<User> findByRole(Role role);
}
