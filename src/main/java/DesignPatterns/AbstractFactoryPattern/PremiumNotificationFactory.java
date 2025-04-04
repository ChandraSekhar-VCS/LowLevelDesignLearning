package DesignPatterns.AbstractFactoryPattern;

public class PremiumNotificationFactory implements INotificationFactory {
    @Override
    public IEmailNotification createEmailNotification() {
        return new PremiumEmailNotification();
    }
    @Override
    public ISMSNotification createSMSNotification() {
        return new PremiumSMSNotification();
    }
    @Override
    public IPushNotification createPushNotification() {
        return new PremiumPsuhNotification();
    }
}
