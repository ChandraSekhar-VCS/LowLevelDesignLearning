package DesignPatterns.BehavioralPatterns.MementoPattern;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        CanvasHistory history = new CanvasHistory();

        canvas.draw("Circle");
        history.save(canvas.save());

        canvas.draw("Rectangle");
        history.save(canvas.save());

        canvas.draw("Square");
        history.save(canvas.save());

        System.out.println("The current shapes are: " + canvas.getShapes());

        canvas.restore(history.undo());
        System.out.println("After 1st Undo: " + canvas.getShapes());
        canvas.restore(history.undo());
        System.out.println("After 2nd Undo: " + canvas.getShapes());
        canvas.restore(history.undo());
        System.out.println("After 3rd Undo: " + canvas.getShapes());
    }
}
