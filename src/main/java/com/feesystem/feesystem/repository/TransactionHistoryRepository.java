package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.TransactionHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.time.LocalDate;
import java.util.List;

public interface TransactionHistoryRepository extends MongoRepository<TransactionHistory, String> {
    List<TransactionHistory> findByDateBetween(LocalDate start, LocalDate end);
}
