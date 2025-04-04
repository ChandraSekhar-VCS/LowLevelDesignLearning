package DesignPatterns.FactoryPattern;

public class PushNotification implements INotification {
    @Override
    public void send(String message){
        System.out.println("Sending Push Notification: " + message);
    }
}
