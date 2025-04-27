package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.Receipt;
import com.feesystem.feesystem.repository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {

    @Autowired
    private ReceiptRepository repo;

    @GetMapping
    public List<Receipt> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Receipt> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/by-date")
    public List<Receipt> getByDateRange(@RequestParam String start, @RequestParam String end) {
        LocalDate s = LocalDate.parse(start);
        LocalDate e = LocalDate.parse(end);
        return repo.findByIssuedDateBetween(s, e);
    }

    @PostMapping
    public Receipt create(@RequestBody Receipt receipt) {
        return repo.save(receipt);
    }

    @PutMapping("/{id}")
    public Receipt update(@PathVariable String id, @RequestBody Receipt receipt) {
        receipt.setId(id);
        return repo.save(receipt);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
