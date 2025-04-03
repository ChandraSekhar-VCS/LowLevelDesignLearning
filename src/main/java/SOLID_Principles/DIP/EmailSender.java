package SOLID_Principles.DIP;

public class EmailSender implements INotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}
