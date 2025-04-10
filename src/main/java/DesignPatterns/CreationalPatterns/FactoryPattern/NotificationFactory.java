package DesignPatterns.CreationalPatterns.FactoryPattern;

public class NotificationFactory {
    public static INotification createNotification(String type){
        if(type.equalsIgnoreCase("Email")){
            return new EmailNotification();
        }
        else if(type.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }
        else if(type.equalsIgnoreCase("Push")){
            return new PushNotification();
        }
        else{
            throw new  IllegalArgumentException("Invalid Notification Type");
        }
    }
}
