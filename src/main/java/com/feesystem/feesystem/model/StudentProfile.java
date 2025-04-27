package com.feesystem.feesystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student_profiles")

public class StudentProfile {

    @Id
    private String id;
    private String fullName;
    private String admissionNumber;

    @DBRef
    private Classroom classroom;

    public StudentProfile(String id, String fullName, String admissionNumber, Classroom classroom) {
        this.id = id;
        this.fullName = fullName;
        this.admissionNumber = admissionNumber;
        this.classroom = classroom;
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

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
