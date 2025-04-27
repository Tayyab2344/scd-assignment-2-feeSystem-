package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.Receipt;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.time.LocalDate;
import java.util.List;

public interface ReceiptRepository extends MongoRepository<Receipt, String> {
    List<Receipt> findByIssuedDateBetween(LocalDate start, LocalDate end);
}
