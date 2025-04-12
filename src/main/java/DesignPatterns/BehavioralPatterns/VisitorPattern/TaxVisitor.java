package DesignPatterns.BehavioralPatterns.VisitorPattern;

public interface TaxVisitor {
    void visit(Book book);
    void visit(Clothing clothing);
    void visit(Electronics electronics);
}
