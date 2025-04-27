package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.TransactionHistory;
import com.feesystem.feesystem.repository.TransactionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transactionHistories")
public class TransactionHistoryController {

    @Autowired
    private TransactionHistoryRepository repo;

    @GetMapping
    public List<TransactionHistory> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TransactionHistory> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/by-date")
    public List<TransactionHistory> getByDateRange(@RequestParam String start, @RequestParam String end) {
        LocalDate s = LocalDate.parse(start);
        LocalDate e = LocalDate.parse(end);
        return repo.findByDateBetween(s, e);
    }

    @PostMapping
    public TransactionHistory create(@RequestBody TransactionHistory transaction) {
        return repo.save(transaction);
    }

    @PutMapping("/{id}")
    public TransactionHistory update(@PathVariable String id, @RequestBody TransactionHistory transaction) {
        transaction.setId(id);
        return repo.save(transaction);
    }

    // <--- Corrected line: removed the extra ']' after "{id}"
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
