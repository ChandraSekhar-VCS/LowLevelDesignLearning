package DesignPatterns.AbstractFactoryPattern;

public class BasicNotificationFactory implements INotificationFactory {
    @Override
    public IEmailNotification createEmailNotification(){
        return new BasicEmailNotification();
    }
    @Override
    public ISMSNotification createSMSNotification(){
        return new BasicSMSNotification();
    }
    @Override
    public IPushNotification createPushNotification(){
        return new  BasicPushNotification();
    }
}