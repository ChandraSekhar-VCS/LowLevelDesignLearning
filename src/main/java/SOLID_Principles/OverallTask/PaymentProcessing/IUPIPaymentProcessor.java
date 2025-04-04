package SOLID_Principles.OverallTask.PaymentProcessing;

public interface IUPIPaymentProcessor extends IPaymentProcessor {
    void processUPIPayment(double  amount);
}
