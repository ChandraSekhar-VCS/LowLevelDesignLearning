package DesignPatterns.BehavioralPatterns.VisitorPattern;

public class Book implements CartElement{
    private double basePrice;
    public Book(double basePrice){
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
