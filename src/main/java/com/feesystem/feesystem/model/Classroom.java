package com.feesystem.feesystem.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "classrooms")

public class Classroom {
    @Id
    private String id;
    private String name;

    @DBRef
    private School school;

    public Classroom() {
    }
    public Classroom(String id, String name, School school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public School getSchool() {
        return school;
    }
    public void setSchool(School school) {
        this.school = school;
    }
}
