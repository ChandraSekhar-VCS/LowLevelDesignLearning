package DesignPatterns.StructuralPatterns.FlyweightPattern;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = TreeFactory.getTree("Pine Tree");
        Tree tree2 = TreeFactory.getTree("Mango Tree");
        Tree tree3 = TreeFactory.getTree("Oak Tree");

        tree1.render(10,20);
        tree2.render(30,40);
        tree3.render(60,50);

        System.out.println("Tree1 & Tree2 Is same object? "+ (tree1==tree2));
        System.out.println("Tree1 & Tree3 Is same object? "+ (tree1==tree3));
        System.out.println("Tree2 & Tree3 Is same object? "+ (tree2==tree3));
    }
}
