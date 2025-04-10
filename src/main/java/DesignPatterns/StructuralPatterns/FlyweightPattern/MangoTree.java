package DesignPatterns.StructuralPatterns.FlyweightPattern;

public class MangoTree implements  Tree {
    private final String name = "Mango Tree";
    private final String description = "This is Mango Tree produces Mangoes";
    @Override
    public void render(int x, int y) {
        System.out.println("Mango Tree is rendered at: ("+x+","+y+")");
    }
}
