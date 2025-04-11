package DesignPatterns.BehavioralPatterns.MediatorPattern;

public abstract class Flight {
    protected String flightId;
    protected Mediator mediator;
    public Flight(String flightId, Mediator mediator) {
        this.flightId = flightId;
        this.mediator = mediator;
    }
    public abstract void send(String message);
    public abstract void receive(String message);
}
