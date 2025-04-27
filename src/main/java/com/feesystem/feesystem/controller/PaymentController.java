package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.Payment;
import com.feesystem.feesystem.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentRepository repo;

    @GetMapping
    public List<Payment> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Payment> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/by-student")
    public List<Payment> getByStudent(@RequestParam String studentProfileId) {
        return repo.findByStudentProfileId(studentProfileId);
    }

    @GetMapping("/by-structure")
    public List<Payment> getByStructure(@RequestParam String feeStructureId) {
        return repo.findByFeeStructureId(feeStructureId);
    }

    @GetMapping("/by-status")
    public List<Payment> getByStatus(@RequestParam String status) {
        return repo.findByStatus(status);
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return repo.save(payment);
    }

    @PutMapping("/{id}")
    public Payment update(@PathVariable String id, @RequestBody Payment payment) {
        payment.setId(id);
        return repo.save(payment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
