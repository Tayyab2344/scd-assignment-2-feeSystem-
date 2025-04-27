package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.StudentProfile;
import com.feesystem.feesystem.repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentProfileService {

    @Autowired
    private StudentProfileRepository repo;

    public List<StudentProfile> getAllStudentProfiles() {
        return repo.findAll();
    }

    public Optional<StudentProfile> getStudentProfileById(String id) {
        return repo.findById(id);
    }

    public Optional<StudentProfile> getStudentProfileByAdmissionNumber(String admissionNumber) {
        return repo.findByAdmissionNumber(admissionNumber);
    }

    public List<StudentProfile> getStudentProfilesByClassroom(String classroomId) {
        return repo.findByClassroomId(classroomId);
    }

    public StudentProfile createStudentProfile(StudentProfile profile) {
        return repo.save(profile);
    }

    public StudentProfile updateStudentProfile(String id, StudentProfile profile) {
        profile.setId(id);
        return repo.save(profile);
    }

    public void deleteStudentProfile(String id) {
        repo.deleteById(id);
    }
}
