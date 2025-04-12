package DesignPatterns.BehavioralPatterns.VisitorPattern;

public class Clothing implements CartElement{
    private double basePrice;
    public Clothing(double basePrice) {
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
