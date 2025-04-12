package DesignPatterns.BehavioralPatterns.MementoPattern;

import java.util.Stack;

public class CanvasHistory {
    private Stack<CanvasMemento> history = new Stack<>();
    public void save(CanvasMemento canvasMemento){
        history.push(canvasMemento);
    }
    public CanvasMemento undo(){
        if(!history.isEmpty()){
            return history.pop();
        }
        return null;
    }
}
