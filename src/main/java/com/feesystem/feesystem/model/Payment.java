package com.feesystem.feesystem.model;


import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payments")

public class Payment {
    @Id
    private String id;
    private double amount;
    private String method;
    private LocalDate date;
    private String status;

    @DBRef
    private FeeStructure feeStructure;
    @DBRef
    private StudentProfile studentProfile;

    public Payment() {
    }
    public Payment(String id, double amount, String method, LocalDate date, String status, FeeStructure feeStructure, StudentProfile studentProfile) {
        this.id = id;
        this.amount = amount;
        this.method = method;
        this.date = date;
        this.status = status;
        this.feeStructure = feeStructure;
        this.studentProfile = studentProfile;
    }   
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public FeeStructure getFeeStructure() {
        return feeStructure;
    }
    public void setFeeStructure(FeeStructure feeStructure) {
        this.feeStructure = feeStructure;
    }
    public StudentProfile getStudentProfile() {
        return studentProfile;
    }
    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }
    
}
