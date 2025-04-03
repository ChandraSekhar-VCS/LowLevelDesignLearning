package SOLID_Principles.ISP;

public class UPIPaymentProcessor implements IUPIPaymentProcessor{
    @Override
    public void processUPIpayment() {
        System.out.println("Processing UPI Payment");
    }
}
