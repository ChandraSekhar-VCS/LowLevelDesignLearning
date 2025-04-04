package SOLID_Principles.OverallTask.PaymentProcessing;

public class CreditCardProcessor implements ICreditCardProcessor {
    @Override
    public void processCreditCardPayment(double amount) {
        System.out.println("Processing Credit Card Payment for an amount of " + amount);
    }
    @Override
    public void  processPayment(double amount) {
        processCreditCardPayment(amount);
    }
}
