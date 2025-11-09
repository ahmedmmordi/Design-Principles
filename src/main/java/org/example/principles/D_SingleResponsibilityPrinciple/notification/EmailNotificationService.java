package org.example.principles.D_SingleResponsibilityPrinciple.notification;

public class EmailNotificationService implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("Email Notification: " + message);
    }
}
