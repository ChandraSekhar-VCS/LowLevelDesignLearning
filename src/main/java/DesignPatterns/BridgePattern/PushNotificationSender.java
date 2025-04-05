package DesignPatterns.BridgePattern;

/**
 * PushNotificationSender class is an implementation of the MessageSender which is used for sending Push Notifications
 */
public class PushNotificationSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
