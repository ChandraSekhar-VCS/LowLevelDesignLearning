package SOLID_Principles.OverallTask.NotificationProcessing;

public interface IEmailSender extends INotificationSender {
    void sendEmailNotification(String  message);
}
