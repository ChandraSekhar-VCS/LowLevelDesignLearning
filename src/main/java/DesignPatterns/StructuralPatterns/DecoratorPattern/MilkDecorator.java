package DesignPatterns.StructuralPatterns.DecoratorPattern;

public class MilkDecorator extends BeverageDecerator{
    public MilkDecorator(Bevarage bevarage) {
        super(bevarage);
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Milk ";
    }
    @Override
    public double cost() {
        return bevarage.cost() + 20;
    }
}
