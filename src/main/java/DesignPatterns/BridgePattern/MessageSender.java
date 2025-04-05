package DesignPatterns.BridgePattern;

/**
 * MessageSender interface is the basic interface that defines the sendMessage method that is to be implemented by the
 * various type of notifications
 */
public interface MessageSender {
    void sendMessage(String message);
}
