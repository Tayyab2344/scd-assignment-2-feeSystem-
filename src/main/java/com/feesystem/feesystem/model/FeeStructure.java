package com.feesystem.feesystem.model;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fee_structures")

public class FeeStructure {
    @Id
    private String id;
    private double amount;
    private LocalDate dueDate;

    @DBRef
    private FeeCategory feeCategory;
    @DBRef
    private List<Discount> discounts;
    @DBRef
    private Classroom classroom;

    public FeeStructure() {
    }   
    public FeeStructure(String id, double amount, LocalDate dueDate, FeeCategory feeCategory, List<Discount> discounts, Classroom classroom) {
        this.id = id;
        this.amount = amount;
        this.dueDate = dueDate;
        this.feeCategory = feeCategory;
        this.discounts = discounts;
        this.classroom = classroom;
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
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public FeeCategory getFeeCategory() {
        return feeCategory;
    }
    public void setFeeCategory(FeeCategory feeCategory) {
        this.feeCategory = feeCategory;
    }
    public List<Discount> getDiscounts() {
        return discounts;
    }
    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }
    public Classroom getClassroom() {
        return classroom;
    }
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    
}
