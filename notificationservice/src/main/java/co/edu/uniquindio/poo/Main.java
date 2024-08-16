package co.edu.uniquindio.poo;

public class Main {

    public static void main(String[] args) {
        NotificationServiceFactory notificationServiceFactory = new NotificationServiceFactory();
        NotificationService email = notificationServiceFactory.sendNotification("Email");
        NotificationService sms = notificationServiceFactory.sendNotification("sms");
        NotificationService other = notificationServiceFactory.sendNotification("face time");

        sms.send();
        email.send();
        other.send();

    }
}
