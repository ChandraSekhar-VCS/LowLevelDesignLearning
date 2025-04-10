package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

public class PremiumSMSNotification implements ISMSNotification{
    @Override
    public void send(String message){
        System.out.println("*** Premium SMS *** : " + message);
    }
}
