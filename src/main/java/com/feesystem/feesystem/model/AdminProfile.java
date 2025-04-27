package com.feesystem.feesystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin_profiles")

public class AdminProfile {

    @Id
    private String id;
    private String fullName;

    public AdminProfile() {
    }
    public AdminProfile(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
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
}
