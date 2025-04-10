package DesignPatterns.StructuralPatterns.DecoratorPattern;

public class Latte implements Bevarage {
    @Override
    public String getDescription() {
        return "Latte";
    }
    @Override
    public double cost() {
        return 120;
    }
}
