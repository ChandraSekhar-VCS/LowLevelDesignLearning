package SOLID_Principles.DIP;

public class NotificationService {
    private final INotificationSender notificationSender;
    public NotificationService(INotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }
    public void sendNotification(String message) {
        notificationSender.sendNotification(message);
    }
}
