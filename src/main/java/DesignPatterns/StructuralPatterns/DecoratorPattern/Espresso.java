package DesignPatterns.StructuralPatterns.DecoratorPattern;

public class Espresso implements Bevarage {
    @Override
    public String getDescription(){
        return "Espresso";
    }
    @Override
    public double cost(){
        return 100;
    }
}
