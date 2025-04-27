package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.Classroom;
import com.feesystem.feesystem.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService {

    @Autowired
    private ClassroomRepository repo;

    public List<Classroom> getAllClassrooms() {
        return repo.findAll();
    }

    public Optional<Classroom> getClassroomById(String id) {
        return repo.findById(id);
    }

    public List<Classroom> getClassroomsBySchool(String schoolId) {
        return repo.findBySchoolId(schoolId);
    }

    public Classroom createClassroom(Classroom classroom) {
        return repo.save(classroom);
    }

    public Classroom updateClassroom(String id, Classroom classroom) {
        classroom.setId(id);
        return repo.save(classroom);
    }

    public void deleteClassroom(String id) {
        repo.deleteById(id);
    }
}
