package DesignPatterns.BehavioralPatterns.StatePattern;

public class BookingStartedState implements BookingState {
    @Override
    public void book(TicketBookingContext context) {
        System.out.println("Booking Started, please select the desired ticket and proceed to payment");
    }
    @Override
    public void pay(TicketBookingContext context) {
        System.out.println("Payment Started.....");
        context.setState(new PaymentprocessingState());
    }
    public void issue(TicketBookingContext context) {
        System.out.println("You have not made the payment yet, Ticket cannot be issued!!");
    }
}
