package com.feesystem.feesystem.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "transaction_histories")

public class TransactionHistory {
    @Id
    private String id;
    private String details;
    private LocalDate date;

    public TransactionHistory() {
    }
    public TransactionHistory(String id, String details, LocalDate date) {
        this.id = id;
        this.details = details;
        this.date = date;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
}
