package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.Payment;
import com.feesystem.feesystem.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repo;

    public List<Payment> getAllPayments() {
        return repo.findAll();
    }

    public Optional<Payment> getPaymentById(String id) {
        return repo.findById(id);
    }

    public List<Payment> getPaymentsByStudent(String studentProfileId) {
        return repo.findByStudentProfileId(studentProfileId);
    }

    public List<Payment> getPaymentsByStructure(String feeStructureId) {
        return repo.findByFeeStructureId(feeStructureId);
    }

    public List<Payment> getPaymentsByStatus(String status) {
        return repo.findByStatus(status);
    }

    public Payment createPayment(Payment payment) {
        return repo.save(payment);
    }

    public Payment updatePayment(String id, Payment payment) {
        payment.setId(id);
        return repo.save(payment);
    }

    public void deletePayment(String id) {
        repo.deleteById(id);
    }
}
