package DesignPatterns.BehavioralPatterns.MementoPattern;

public class CanvasMemento {
    private final String shape;
    public  CanvasMemento(String shape) {
        this.shape = shape;
    }
    public String getSavedShape() {
        return shape;
    }
}
