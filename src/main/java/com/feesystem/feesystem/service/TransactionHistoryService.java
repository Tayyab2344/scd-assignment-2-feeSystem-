package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.TransactionHistory;
import com.feesystem.feesystem.repository.TransactionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionHistoryService {

    @Autowired
    private TransactionHistoryRepository repo;

    public List<TransactionHistory> getAllHistories() {
        return repo.findAll();
    }

    public Optional<TransactionHistory> getHistoryById(String id) {
        return repo.findById(id);
    }

    public List<TransactionHistory> getHistoriesByDateRange(LocalDate start, LocalDate end) {
        return repo.findByDateBetween(start, end);
    }

    public TransactionHistory createHistory(TransactionHistory history) {
        return repo.save(history);
    }

    public TransactionHistory updateHistory(String id, TransactionHistory history) {
        history.setId(id);
        return repo.save(history);
    }

    public void deleteHistory(String id) {
        repo.deleteById(id);
    }
}
