package DesignPatterns.BehavioralPatterns.VisitorPattern;

public class Electronics implements CartElement{
    private double basePrice;
    public Electronics(double basePrice) {
        this.basePrice = basePrice;
    }
    public double getBasePrice() {
        return basePrice;
    }
    @Override
    public void accept(TaxVisitor visitor){
        visitor.visit(this);
    }
}
