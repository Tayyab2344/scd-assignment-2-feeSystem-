package com.feesystem.feesystem.controller;

import com.feesystem.feesystem.model.Notification;
import com.feesystem.feesystem.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationRepository repo;

    @GetMapping
    public List<Notification> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Notification> getById(@PathVariable String id) {
        return repo.findById(id);
    }

    @GetMapping("/unread")
    public List<Notification> getUnread() {
        return repo.findByIsReadFalse();
    }

    @PostMapping
    public Notification create(@RequestBody Notification notification) {
        return repo.save(notification);
    }

    @PutMapping("/{id}")
    public Notification update(@PathVariable String id, @RequestBody Notification notification) {
        notification.setId(id);
        return repo.save(notification);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
