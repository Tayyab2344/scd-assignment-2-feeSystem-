package com.feesystem.feesystem.model;


import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "receipts")

public class Receipt {
    @Id
    private String id;
    private LocalDate issuedDate;
    private String details;

    public Receipt() {
    }
    public Receipt(String id, LocalDate issuedDate, String details) {
        this.id = id;
        this.issuedDate = issuedDate;
        this.details = details;
    }   
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDate getIssuedDate() {
        return issuedDate;
    }
    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    
}
