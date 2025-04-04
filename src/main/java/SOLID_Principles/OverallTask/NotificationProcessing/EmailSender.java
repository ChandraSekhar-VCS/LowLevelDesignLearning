package SOLID_Principles.OverallTask.NotificationProcessing;

public class EmailSender implements IEmailSender {
    @Override
    public void sendEmailNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
    @Override
    public void sendNotification(String  message) {
        sendEmailNotification(message);
    }
}
