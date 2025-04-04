package DesignPatterns.AbstractFactoryPattern;

public class PremiumPsuhNotification implements IPushNotification{
    @Override
    public void send(String message){
        System.out.println("*** Premium Push *** : " + message);
    }
}
