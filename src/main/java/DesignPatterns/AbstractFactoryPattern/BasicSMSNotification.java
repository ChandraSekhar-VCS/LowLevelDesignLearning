package DesignPatterns.AbstractFactoryPattern;

public class BasicSMSNotification implements ISMSNotification{
    @Override
    public void send(String message) {
        System.out.println("Basic SMS: "+message);
    }
}
