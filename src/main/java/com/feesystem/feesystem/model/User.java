package com.feesystem.feesystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")

public class User {

    @Id
    private String id;
    private String username;
    private String password;
    private Role role;

    @DBRef
    private AdminProfile adminProfile;
    @DBRef
    private GuardianProfile guardianProfile;
    @DBRef
    private StudentProfile studentProfile;

    public User() {
    }

    public User(String id, String username, String password, Role role, AdminProfile adminProfile, GuardianProfile guardianProfile, StudentProfile studentProfile) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.adminProfile = adminProfile;
        this.guardianProfile = guardianProfile;
        this.studentProfile = studentProfile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public AdminProfile getAdminProfile() {
        return adminProfile;
    }

    public void setAdminProfile(AdminProfile adminProfile) {
        this.adminProfile = adminProfile;
    }

    public GuardianProfile getGuardianProfile() {
        return guardianProfile;
    }

    public void setGuardianProfile(GuardianProfile guardianProfile) {
        this.guardianProfile = guardianProfile;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    
}