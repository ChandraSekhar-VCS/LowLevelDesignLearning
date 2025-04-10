package DesignPatterns.StructuralPatterns.BridgePattern;

import java.util.Scanner;

/**
 * Main class for testing the Bridge Pattern implementation.
 * Allows user to choose message type and sender type dynamically,
 * and sends the message using the selected configuration.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose Message Type
        System.out.println("Choose Message Type:");
        System.out.println("1. Text Message");
        System.out.println("2. Urgent Message");
        int messageChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Choose Sender Type
        System.out.println("Choose Sender Type:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Push Notification");
        int senderChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Enter the Message Content
        System.out.print("Enter your message: ");
        String content = scanner.nextLine();

        // Create Sender
        MessageSender sender = null;
        switch (senderChoice) {
            case 1 -> sender = new EmailSender();
            case 2 -> sender = new SMSSender();
            case 3 -> sender = new PushNotificationSender();
            default -> {
                System.out.println("Invalid sender type!");
                return;
            }
        }

        // Create Message
        Message message = null;
        switch (messageChoice) {
            case 1 -> message = new TextMessage(sender);
            case 2 -> message = new UrgentMessage(sender);
            default -> {
                System.out.println("Invalid message type!");
                return;
            }
        }

        // Send the message
        message.send(content);

        scanner.close();
    }
}

