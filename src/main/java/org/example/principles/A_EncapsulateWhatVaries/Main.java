package org.example.principles.A_EncapsulateWhatVaries;

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
