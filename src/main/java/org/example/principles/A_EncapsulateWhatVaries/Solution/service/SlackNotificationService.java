package org.example.principles.A_EncapsulateWhatVaries.Solution.service;

public class SlackNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Slack: " + message);
    }
}
