package DesignPatterns.StructuralPatterns.BridgePattern;

/**
 * UrgentMessage is a child class of Message that sends Urgent type of messages
 */
public class UrgentMessage extends Message{
    public UrgentMessage(MessageSender messageSender) {
        super(messageSender);
    }
    @Override
    void send(String content) {
        messageSender.sendMessage( "[Urgent] "+ content);
    }
}
