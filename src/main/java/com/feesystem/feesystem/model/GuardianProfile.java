package com.feesystem.feesystem.model;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "guardian_profiles")

public class GuardianProfile {
    @Id
    private String id;
    private String fullName;
    private String email;

    @DBRef
    private List<StudentProfile> studentProfiles;


    public GuardianProfile() {
    }
    public GuardianProfile(String id, String fullName, String email, List<StudentProfile> studentProfiles) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.studentProfiles = studentProfiles;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<StudentProfile> getStudentProfiles() {
        return studentProfiles;
    }
    public void setStudentProfiles(List<StudentProfile> studentProfiles) {
        this.studentProfiles = studentProfiles;
    }
}
