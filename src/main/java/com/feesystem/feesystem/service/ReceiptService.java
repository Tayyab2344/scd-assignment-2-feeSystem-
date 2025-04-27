package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.Receipt;
import com.feesystem.feesystem.repository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ReceiptService {

    @Autowired
    private ReceiptRepository repo;

    public List<Receipt> getAllReceipts() {
        return repo.findAll();
    }

    public Optional<Receipt> getReceiptById(String id) {
        return repo.findById(id);
    }

    public List<Receipt> getReceiptsByDateRange(LocalDate start, LocalDate end) {
        return repo.findByIssuedDateBetween(start, end);
    }

    public Receipt createReceipt(Receipt receipt) {
        return repo.save(receipt);
    }

    public Receipt updateReceipt(String id, Receipt receipt) {
        receipt.setId(id);
        return repo.save(receipt);
    }

    public void deleteReceipt(String id) {
        repo.deleteById(id);
    }
}
