package SOLID_Principles.ISP;

public class Main {
    public static void main(String[] args) {
        ICreditCardPaymentProcessor  creditCardPaymentProcessor = new CreditCardProcessor();
        creditCardPaymentProcessor.processCreditCardPayment();

        IDebitCardPaymentProcessor  debitCardPaymentProcessor = new DebitCardProcessor();
        debitCardPaymentProcessor.processDebitCardPayment();

        IUPIPaymentProcessor  upiPaymentProcessor = new UPIPaymentProcessor();
        upiPaymentProcessor.processUPIpayment();

    }
}
