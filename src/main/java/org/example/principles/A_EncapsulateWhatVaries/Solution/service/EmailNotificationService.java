package org.example.principles.A_EncapsulateWhatVaries.Solution.service;

public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
