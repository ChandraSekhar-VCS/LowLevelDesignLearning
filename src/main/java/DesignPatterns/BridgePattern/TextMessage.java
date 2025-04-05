package DesignPatterns.BridgePattern;

/**
 * TextMessage is a child class of Message which is used to send text type of message
 */
public class TextMessage extends Message{
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }
    @Override
    public void send(String content) {
        messageSender.sendMessage("[Text] "+ content);
    }
}
