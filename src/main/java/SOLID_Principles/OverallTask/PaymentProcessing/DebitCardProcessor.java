package SOLID_Principles.OverallTask.PaymentProcessing;

public class DebitCardProcessor implements IDebitCardProcessor {
    @Override
    public void processDebitCardPayment(double amount) {
        System.out.println("Processing Debit Card Payment for an amount of " + amount);
    }
    @Override
    public void processPayment(double  amount) {
        processDebitCardPayment(amount);
    }
}
