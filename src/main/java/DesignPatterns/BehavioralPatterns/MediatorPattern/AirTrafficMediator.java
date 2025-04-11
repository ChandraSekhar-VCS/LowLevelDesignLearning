package DesignPatterns.BehavioralPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficMediator implements Mediator {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    @Override
    public void sendCommunication(String  message, Flight flight) {
        for(Flight fl : flights) {
            if(fl != flight) {
                fl.send(message);
            }
        }
    }
}
