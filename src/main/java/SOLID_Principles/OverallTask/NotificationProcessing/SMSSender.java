package SOLID_Principles.OverallTask.NotificationProcessing;

public class SMSSender implements ISMSSender {
    @Override
    public void sendSMSNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
    @Override
    public void sendNotification(String  message) {
        sendSMSNotification(message);
    }
}
