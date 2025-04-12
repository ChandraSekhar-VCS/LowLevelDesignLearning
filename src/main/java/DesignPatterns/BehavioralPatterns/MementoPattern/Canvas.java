package DesignPatterns.BehavioralPatterns.MementoPattern;

public class Canvas {
    private String shape = "";
    public void draw(String shape){
        this.shape += shape + " ";
    }
    public String getShapes(){
        return this.shape;
    }
    public CanvasMemento save(){
        return new CanvasMemento(this.shape);
    }
    public void restore(CanvasMemento canvasMemento){
        this.shape = canvasMemento.getSavedShape();
    }
}
