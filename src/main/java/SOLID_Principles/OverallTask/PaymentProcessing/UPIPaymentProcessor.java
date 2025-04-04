package SOLID_Principles.OverallTask.PaymentProcessing;

public class UPIPaymentProcessor implements IUPIPaymentProcessor {
    @Override
    public void processUPIPayment(double  amount) {
        System.out.println("Processing UPI Payment for an amount of " + amount);
    }
    @Override
    public void processPayment(double amount) {
        processUPIPayment(amount);
    }
}
