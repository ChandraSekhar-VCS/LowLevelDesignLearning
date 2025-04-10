package DesignPatterns.StructuralPatterns.DecoratorPattern;

public class SugarDecorator extends BeverageDecerator{
    public SugarDecorator(Bevarage bevarage) {
        super(bevarage);
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Sugar";
    }
    @Override
    public double cost() {
        return bevarage.cost() + 10;
    }
}
