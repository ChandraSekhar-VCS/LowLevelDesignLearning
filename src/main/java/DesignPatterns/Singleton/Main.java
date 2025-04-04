package DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        LoggerSingleton loggerSingleton = LoggerSingleton.getInstance();
        Thread warningThread = new Thread(()->{
            loggerSingleton.logMessage(MessageType.WARN,"This is a warning");
        });
        Thread errorThread = new Thread(()->{
            loggerSingleton.logMessage(MessageType.ERROR,"This is an error");
        });
        Thread infoThread = new Thread(()->{
            loggerSingleton.logMessage(MessageType.INFO,"This is a info");
        });

        warningThread.start();
        errorThread.start();
        infoThread.start();
    }
}
