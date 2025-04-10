package DesignPatterns.StructuralPatterns.FlyweightPattern;

public class PineTree implements Tree {
    private String name = "Pine Tree";
    private String description = "This is a Pine Tree used for Producing Pine";
    @Override
    public  void render(int x, int y) {
        System.out.println("Pine Tree is rendered at: (" + x + ", " + y + ")");
    }
}
