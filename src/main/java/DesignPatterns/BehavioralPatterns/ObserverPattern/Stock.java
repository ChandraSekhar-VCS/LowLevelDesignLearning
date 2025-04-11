package DesignPatterns.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{
    private String stockSymbol;
    private double price;
    private List<Observer> observers =  new ArrayList<>();
    public  Stock(String stockSymbol, double price) {
        this.stockSymbol = stockSymbol;
        this.price = price;
    }
    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(this.stockSymbol,this.price);
        }
    }
    public String getStockSymbol() {
        return stockSymbol;
    }
    public void updatePrice(double newPrice) {
        if (this.price != newPrice) {
            this.price = newPrice;
            notifyObservers();
        }
    }
}
