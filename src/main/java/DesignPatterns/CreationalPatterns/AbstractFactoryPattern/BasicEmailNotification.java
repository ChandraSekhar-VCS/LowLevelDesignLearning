package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

public class BasicEmailNotification implements IEmailNotification{
    @Override
    public void send(String message){
        System.out.println("Basic Email: "+message);
    }
}
