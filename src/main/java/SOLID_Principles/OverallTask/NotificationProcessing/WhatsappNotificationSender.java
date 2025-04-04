package SOLID_Principles.OverallTask.NotificationProcessing;

public class WhatsappNotificationSender implements IWhatsappSender{
    @Override
    public void sendWhatsappNotification(String message) {
        System.out.println("Whatsapp Notification: " + message);
    }
    @Override
    public void sendNotification(String  message) {
        sendWhatsappNotification(message);
    }
}
