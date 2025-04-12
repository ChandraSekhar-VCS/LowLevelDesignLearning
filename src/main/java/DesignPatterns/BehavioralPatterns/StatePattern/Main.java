package DesignPatterns.BehavioralPatterns.StatePattern;

public class Main {
    public static void main(String[] args) {
        TicketBookingContext context = new TicketBookingContext();
        context.book();
        context.pay();
        context.pay();
        context.issue();
    }
}
