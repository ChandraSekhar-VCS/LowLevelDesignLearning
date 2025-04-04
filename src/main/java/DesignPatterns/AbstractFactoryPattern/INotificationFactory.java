package DesignPatterns.AbstractFactoryPattern;

public interface INotificationFactory {
    IEmailNotification createEmailNotification();
    ISMSNotification createSMSNotification();
    IPushNotification createPushNotification();
}
