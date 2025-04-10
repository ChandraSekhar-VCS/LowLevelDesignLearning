package DesignPatterns.StructuralPatterns.FacadePattern;

public class NotificationService {
    public void sendNotification(String studentName, String courseName) {
        System.out.println("Conformation Email: Hi " + studentName + " you have been successfully enrolled in the course "+ courseName);
    }
}
