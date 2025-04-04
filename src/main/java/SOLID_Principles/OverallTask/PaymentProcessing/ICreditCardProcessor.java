package SOLID_Principles.OverallTask.PaymentProcessing;

public interface ICreditCardProcessor extends IPaymentProcessor {
    void processCreditCardPayment(double amount);
}
