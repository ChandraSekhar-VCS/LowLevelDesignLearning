package SOLID_Principles.ISP;

public class CreditCardProcessor implements ICreditCardPaymentProcessor {
    @Override
    public void processCreditCardPayment() {
        System.out.println("Processing Credit Card Payment");
    }
}
