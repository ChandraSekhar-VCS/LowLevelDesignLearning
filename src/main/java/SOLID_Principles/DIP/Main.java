package SOLID_Principles.DIP;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailSender());
        emailService.sendNotification("Hello World!");

        NotificationService smsService = new NotificationService(new SMSSender());
        smsService.sendNotification("Hello World!");
    }
}
