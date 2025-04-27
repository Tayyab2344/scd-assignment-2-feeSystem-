package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.Discount;
import com.feesystem.feesystem.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/discounts")
public class DiscountController {

    @Autowired
    private DiscountRepository repo;

    @GetMapping
    public List<Discount> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Discount> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/below-percentage")
    public List<Discount> getBelow(@RequestParam double percentage) {
        return repo.findByPercentageLessThan(percentage);
    }

    @PostMapping
    public Discount create(@RequestBody Discount discount) {
        return repo.save(discount);
    }

    @PutMapping("/{id}")
    public Discount update(@PathVariable String id, @RequestBody Discount discount) {
        discount.setId(id);
        return repo.save(discount);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
