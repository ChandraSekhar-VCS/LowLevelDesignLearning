package DesignPatterns.AbstractFactoryPattern;


import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Basic/Premium Notification: ");
        String variant = sc.nextLine();
        System.out.print("Enter the type of Notification: ");
        String type = sc.nextLine();

        INotificationFactory notificationFactory;
        if(variant.equalsIgnoreCase("basic")){
            notificationFactory = new BasicNotificationFactory();
        }
        else if(variant.equalsIgnoreCase("premium")){
            notificationFactory = new PremiumNotificationFactory();
        }
        else{
            System.out.println("Invalid variant selected");
            return;
        }

        System.out.print("Enter your message:");
        String  message = sc.nextLine();

        switch(type.toLowerCase()){
            case "email":
                IEmailNotification emailNotification = notificationFactory.createEmailNotification();
                emailNotification.send(message);
                break;
            case "sms":
                ISMSNotification smsNotification = notificationFactory.createSMSNotification();
                smsNotification.send(message);
                break;
            case "push":
                IPushNotification pushNotification = notificationFactory.createPushNotification();
                pushNotification.send(message);
                break;
            default:
                System.out.println("Invalid type selected");
                break;
        }
        sc.close();
    }
}
