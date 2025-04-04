package SOLID_Principles.OverallTask.PaymentProcessing;

public interface IDebitCardProcessor extends IPaymentProcessor {
    void processDebitCardPayment(double amount);
}
