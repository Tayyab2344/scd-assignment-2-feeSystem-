package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.School;
import com.feesystem.feesystem.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository repo;

    public List<School> getAllSchools() {
        return repo.findAll();
    }

    public Optional<School> getSchoolById(String id) {
        return repo.findById(id);
    }

    public Optional<School> getSchoolByName(String name) {
        return repo.findByName(name);
    }

    public School createSchool(School school) {
        return repo.save(school);
    }

    public School updateSchool(String id, School school) {
        school.setId(id);
        return repo.save(school);
    }

    public void deleteSchool(String id) {
        repo.deleteById(id);
    }
}
