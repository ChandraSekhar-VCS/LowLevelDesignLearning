package DesignPatterns.BehavioralPatterns.VisitorPattern;

public interface CartElement {
    void accept(TaxVisitor visitor);
}
