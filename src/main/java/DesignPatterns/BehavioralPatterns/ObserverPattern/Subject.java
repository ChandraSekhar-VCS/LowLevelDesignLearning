package DesignPatterns.BehavioralPatterns.ObserverPattern;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
