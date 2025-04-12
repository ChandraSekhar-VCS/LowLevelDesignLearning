package DesignPatterns.BehavioralPatterns.VisitorPattern;

public class IndiaTaxVisitor implements TaxVisitor{
    @Override
    public void visit(Book book) {
        double taxPercentage = 0;
        double taxAmount = (taxPercentage/ book.getBasePrice())*100;
        System.out.println("Visiting Book: Base Price = " +book.getBasePrice() + " Tax = " +taxAmount + " Final  = " + ((book.getBasePrice())+taxAmount));
    }
    @Override
    public void visit(Clothing clothing) {
        double taxPercentage = 10;
        double taxAmount = (taxPercentage/ clothing.getBasePrice())*100;
        System.out.println("Visiting Book: Base Price = " +clothing.getBasePrice() + " Tax = " +taxAmount + " Final  = " + ((clothing.getBasePrice())+taxAmount));
    }
    @Override
    public void visit(Electronics electronics) {
        double taxPercentage = 18;
        double taxAmount = (taxPercentage/ electronics.getBasePrice())*100;
        System.out.println("Visiting Book: Base Price = " +electronics.getBasePrice() + " Tax = " +taxAmount + " Final  = " + ((electronics.getBasePrice())+taxAmount));
    }
}
