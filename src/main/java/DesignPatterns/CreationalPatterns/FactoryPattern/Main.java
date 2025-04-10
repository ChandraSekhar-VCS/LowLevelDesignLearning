package DesignPatterns.CreationalPatterns.FactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the type of Notification: ");
        String notificationType = sc.nextLine();
        System.out.print("Please enter the message you want to send: ");
        String message = sc.nextLine();

        INotification notification = NotificationFactory.createNotification(notificationType);
        notification.send(message);
    }
}
