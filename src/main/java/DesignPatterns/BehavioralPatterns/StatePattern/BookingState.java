package DesignPatterns.BehavioralPatterns.StatePattern;

public interface BookingState {
    void book(TicketBookingContext context);
    void pay(TicketBookingContext context);
    void issue(TicketBookingContext context);
}
