package com.example.Notification_handler.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Notification_handler.models.Notification;


@Repository
public interface NotificationRepo extends JpaRepository<Notification, String> {

}
