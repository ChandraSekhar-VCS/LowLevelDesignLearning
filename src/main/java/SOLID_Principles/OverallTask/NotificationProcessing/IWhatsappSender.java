package SOLID_Principles.OverallTask.NotificationProcessing;

public interface IWhatsappSender extends INotificationSender {
    void sendWhatsappNotification(String message);
}
