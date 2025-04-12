package DesignPatterns.BehavioralPatterns.StatePattern;

public class PaymentprocessingState implements BookingState{
    @Override
    public void book(TicketBookingContext context) {
        System.out.println("You have already selected the Ticket");
    }
    @Override
    public void pay(TicketBookingContext context) {
        System.out.println("Payment Successful, please wait for the ticket to be issued");
        context.setState(new TicketIssuedState());
    }
    @Override
    public void issue(TicketBookingContext context) {
        System.out.println("Payment ios done, ticket cannot be issued");
    }
}
