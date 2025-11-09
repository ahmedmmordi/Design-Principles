package org.example.principles.A_EncapsulateWhatVaries;

import org.example.principles.A_EncapsulateWhatVaries.manager.NotificationManager;
import org.example.principles.A_EncapsulateWhatVaries.service.EmailNotificationService;
import org.example.principles.A_EncapsulateWhatVaries.service.PushNotificationService;
import org.example.principles.A_EncapsulateWhatVaries.service.SMSNotificationService;
import org.example.principles.A_EncapsulateWhatVaries.service.SlackNotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager(new EmailNotificationService());
        notificationManager.send("Hi, How are you?");

        notificationManager = new NotificationManager(new PushNotificationService());
        notificationManager.send("Hi, How are you?");

        notificationManager = new NotificationManager(new SMSNotificationService());
        notificationManager.send("Hi, How are you?");

        notificationManager = new NotificationManager(new SlackNotificationService());
        notificationManager.send("Hi, How are you?");
    }
}
