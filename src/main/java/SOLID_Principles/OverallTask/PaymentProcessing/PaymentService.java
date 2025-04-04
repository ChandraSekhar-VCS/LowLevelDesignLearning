package SOLID_Principles.OverallTask.PaymentProcessing;

public class PaymentService {
    private IPaymentProcessor paymentProcessor;
    public PaymentService(IPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    public void setPaymentProcessor(IPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    public void makePayment(double amount){
        paymentProcessor.processPayment(amount);
    }
}
