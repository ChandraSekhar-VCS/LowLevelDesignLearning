package DesignPatterns.StructuralPatterns.BridgePattern;

/**
 * SMSSender class is an implementation of MessageSender which sends SMS notifications
 */
public class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
