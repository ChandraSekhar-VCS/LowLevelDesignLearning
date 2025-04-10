package DesignPatterns.StructuralPatterns.DecoratorPattern;

public class WhippedCreamDecorator extends BeverageDecerator{
    public WhippedCreamDecorator(Bevarage bevarage) {
        super(bevarage);
    }
    @Override
    public double cost() {
        return bevarage.cost() + 30;
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Whipped cream";
    }
}
