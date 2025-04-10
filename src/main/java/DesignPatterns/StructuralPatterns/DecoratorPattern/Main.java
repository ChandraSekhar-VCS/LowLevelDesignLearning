package DesignPatterns.StructuralPatterns.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Bevarage order1 = new SugarDecorator(new MilkDecorator(new Espresso()));
        System.out.println("Order 1: " + order1.getDescription());
        System.out.println("Total cost: " + order1.cost());

        System.out.println();
        System.out.println();

        Bevarage order2 = new WhippedCreamDecorator(new MilkDecorator(new Latte()));
        System.out.println("Order 2: " + order2.getDescription());
        System.out.println("Total cost: " + order2.cost());
    }
}
