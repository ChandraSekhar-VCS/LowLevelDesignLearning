package SOLID_Principles.OverallTask.NotificationProcessing;

public interface ISMSSender extends INotificationSender {
    void sendSMSNotification(String message);
}
