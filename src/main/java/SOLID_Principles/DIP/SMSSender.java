package SOLID_Principles.DIP;

public class SMSSender implements INotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
