package SOLID_Principles.OverallTask.NotificationProcessing;

public class NotificationService {
    private INotificationSender notificationSender;

    public  NotificationService(INotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }
    public void setNotificationSender(INotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void notifyUser(String message) {
        notificationSender.sendNotification(message);
    }
}
