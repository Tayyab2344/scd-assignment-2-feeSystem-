package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.Discount;
import com.feesystem.feesystem.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiscountService {

    @Autowired
    private DiscountRepository repo;

    public List<Discount> getAllDiscounts() {
        return repo.findAll();
    }

    public Optional<Discount> getDiscountById(String id) {
        return repo.findById(id);
    }

    public List<Discount> getDiscountsBelowPercentage(double percentage) {
        return repo.findByPercentageLessThan(percentage);
    }

    public Discount createDiscount(Discount discount) {
        return repo.save(discount);
    }

    public Discount updateDiscount(String id, Discount discount) {
        discount.setId(id);
        return repo.save(discount);
    }

    public void deleteDiscount(String id) {
        repo.deleteById(id);
    }
}
