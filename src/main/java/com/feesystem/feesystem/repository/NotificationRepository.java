package com.feesystem.feesystem.repository;

import com.feesystem.feesystem.model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface NotificationRepository extends MongoRepository<Notification, String> {
    List<Notification> findByIsReadFalse();
}
