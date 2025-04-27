package com.feesystem.feesystem.service;

import com.feesystem.feesystem.model.Notification;
import com.feesystem.feesystem.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository repo;

    public List<Notification> getAllNotifications() {
        return repo.findAll();
    }

    public Optional<Notification> getNotificationById(String id) {
        return repo.findById(id);
    }

    public List<Notification> getUnreadNotifications() {
        return repo.findByIsReadFalse();
    }

    public Notification createNotification(Notification notification) {
        return repo.save(notification);
    }

    public Notification updateNotification(String id, Notification notification) {
        notification.setId(id);
        return repo.save(notification);
    }

    public void deleteNotification(String id) {
        repo.deleteById(id);
    }
}
