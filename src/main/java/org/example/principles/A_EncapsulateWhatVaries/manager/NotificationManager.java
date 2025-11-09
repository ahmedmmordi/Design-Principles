package org.example.principles.A_EncapsulateWhatVaries.manager;

import org.example.principles.A_EncapsulateWhatVaries.service.NotificationService;

public class NotificationManager {
    private final NotificationService notificationService;
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void send(String message) {
        notificationService.send(message);
    }
}
