package DesignPatterns.AbstractFactoryPattern;

public class BasicPushNotification implements IPushNotification{
    @Override
    public void send(String message) {
        System.out.println("Basic Push Notification: "+message);
    }
}
