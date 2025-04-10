package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

public class PremiumEmailNotification implements IEmailNotification{
    @Override
    public void send(String message){
        System.out.println("*** Premium Email *** : " + message);
    }
}
