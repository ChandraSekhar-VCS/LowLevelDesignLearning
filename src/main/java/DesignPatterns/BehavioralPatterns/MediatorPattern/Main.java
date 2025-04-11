package DesignPatterns.BehavioralPatterns.MediatorPattern;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AirTrafficMediator();

        Flight F123 = new ConcreteFlight("F123", mediator);
        Flight F456 = new ConcreteFlight("F456", mediator);
        Flight F789 = new ConcreteFlight("F789", mediator);

        ((AirTrafficMediator)mediator).addFlight(F123);
        ((AirTrafficMediator) mediator).addFlight(F456);
        ((AirTrafficMediator) mediator).addFlight(F789);

        F123.send("Hello, F123 is ready for takeoff");
        F456.send("Hello, F456 is facing slightly delayed due to bad weather");
    }
}
