package DesignPatterns.BehavioralPatterns.StatePattern;

public class TicketBookingContext {
    private BookingState state;
    public TicketBookingContext() {
        this.state = new BookingStartedState();
    }
    public void setState(BookingState state) {
        this.state = state;
    }
    public void book() {
        state.book(this);
    }
    public void pay() {
        state.pay(this);
    }
    public void issue() {
        state.issue(this);
    }
}
