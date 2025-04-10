package DesignPatterns.StructuralPatterns.BridgePattern;

/**
 * Message is an abstract class that acts as a Bridge connecting
 * MessageSender type to Message type
 */
public abstract class Message {
    MessageSender messageSender;
    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    abstract void send(String content);
}
