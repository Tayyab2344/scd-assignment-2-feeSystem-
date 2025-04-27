package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.Discount;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface DiscountRepository extends MongoRepository<Discount, String> {
    List<Discount> findByPercentageLessThan(double percentage);
}
