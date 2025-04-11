package DesignPatterns.BehavioralPatterns.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Stock tesla = new Stock("Tesla" ,100);

        Investor investor1 = new Investor("Investor 1");
        Investor investor2 = new Investor("Investor 2");
        Investor investor3 = new Investor("Investor 3");

        tesla.registerObserver(investor1);
        tesla.registerObserver(investor2);
        tesla.registerObserver(investor3);

        tesla.updatePrice(150);
        tesla.notifyObservers();
    }
}
