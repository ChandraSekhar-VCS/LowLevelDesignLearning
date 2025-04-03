package SOLID_Principles.ISP;

public class DebitCardProcessor implements IDebitCardPaymentProcessor {
    @Override
    public void processDebitCardPayment() {
        System.out.println("Processing Debit Card Payment");
    }
}
