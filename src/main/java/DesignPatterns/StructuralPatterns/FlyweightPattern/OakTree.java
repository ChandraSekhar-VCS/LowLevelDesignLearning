package DesignPatterns.StructuralPatterns.FlyweightPattern;

public class OakTree implements Tree {
    private final String name = "Oak Tree";
    private final String description = "This is Oak Tree used for Oak wood";
    @Override
    public void render(int x, int y) {
        System.out.println("Oak tree is rendered at: (" + x + ", " + y + ")");
    }
}
