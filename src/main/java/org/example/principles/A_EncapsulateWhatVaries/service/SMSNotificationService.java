package org.example.principles.A_EncapsulateWhatVaries.service;

public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
