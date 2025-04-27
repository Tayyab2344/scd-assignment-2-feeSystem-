package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.StudentProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

public interface StudentProfileRepository extends MongoRepository<StudentProfile, String> {
    Optional<StudentProfile> findByAdmissionNumber(String admissionNumber);
    List<StudentProfile> findByClassroomId(String classroomId);
}
