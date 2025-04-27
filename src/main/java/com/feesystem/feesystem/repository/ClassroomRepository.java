package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.Classroom;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ClassroomRepository extends MongoRepository<Classroom, String> {
    List<Classroom> findBySchoolId(String schoolId);
}
