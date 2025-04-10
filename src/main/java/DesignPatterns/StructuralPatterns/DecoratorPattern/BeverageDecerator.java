package DesignPatterns.StructuralPatterns.DecoratorPattern;

public abstract class BeverageDecerator implements Bevarage {
    protected Bevarage bevarage;
    public BeverageDecerator(Bevarage bevarage) {
        this.bevarage = bevarage;
    }
    public abstract String getDescription();
    public abstract double cost();
}
