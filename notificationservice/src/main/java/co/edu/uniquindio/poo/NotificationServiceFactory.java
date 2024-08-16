package co.edu.uniquindio.poo;

public class NotificationServiceFactory {
    public NotificationService sendNotification(String type) {
        switch (type.toLowerCase()) {
            case "sms":
                return new SendSms();

            case "email":
                return new SendEmail();

            default:
                throw new IllegalArgumentException("Unknown notification" + type);
        }
    }

}
