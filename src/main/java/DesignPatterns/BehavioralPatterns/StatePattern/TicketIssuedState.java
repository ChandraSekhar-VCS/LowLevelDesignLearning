package DesignPatterns.BehavioralPatterns.StatePattern;

public class TicketIssuedState implements BookingState{
    @Override
    public void book(TicketBookingContext context) {
        System.out.println("Ticket is already issued, please collect the ticket");
    }
    @Override
    public void pay(TicketBookingContext context) {
        System.out.println("Ticket is issued , please collect the ticket");
    }
    @Override
    public void issue(TicketBookingContext context) {
        System.out.println("Ticket has been generated successfully!. Please collect it for the ticket slot");
    }
}
