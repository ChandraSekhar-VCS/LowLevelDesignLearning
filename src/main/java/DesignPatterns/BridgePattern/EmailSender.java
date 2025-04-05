package DesignPatterns.BridgePattern;

/**
 * EmailSender class is a implementation of the MessageSender
 * which is used to send Email Notifications only
 */
public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
