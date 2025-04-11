package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public abstract class SupportHandler {
    private SupportHandler nextHandler;
    abstract public void handleRequest(SupportRequest request);
    public SupportHandler setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
    protected SupportHandler getNextHandler() {
        return nextHandler;
    }
}
