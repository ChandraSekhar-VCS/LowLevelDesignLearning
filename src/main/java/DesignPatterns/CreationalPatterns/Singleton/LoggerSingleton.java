package DesignPatterns.CreationalPatterns.Singleton;

import java.time.LocalDateTime;

public class LoggerSingleton {
    private LoggerSingleton() {}
    private static class SingletonHelper{
        private static final LoggerSingleton INSTANCE = new LoggerSingleton();
    }
    public static LoggerSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public synchronized void logMessage(MessageType type,String message){
        System.out.println(LocalDateTime.now() + " " + type + " " + message);
    }
}

