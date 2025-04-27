package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface PaymentRepository extends MongoRepository<Payment, String> {
    List<Payment> findByStudentProfileId(String studentProfileId);
    List<Payment> findByFeeStructureId(String feeStructureId);
    List<Payment> findByStatus(String status);
}
