package DesignPatterns.BehavioralPatterns.MediatorPattern;

public class ConcreteFlight extends Flight {
    public ConcreteFlight(String flightId, Mediator mediator) {
        super(flightId, mediator);
    }
    @Override
    public void send(String message) {
        System.out.println(this.flightId + "sends: "+message);
        mediator.sendCommunication(message,this);
    }
    @Override
    public void receive(String message) {
        System.out.println(this.flightId + "receives: "+message);
    }
}
