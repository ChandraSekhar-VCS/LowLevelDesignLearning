package DesignPatterns.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Investor implements Observer {
    private String investorName;
    public  Investor(String investorName) {
        this.investorName = investorName;
    }
    @Override
    public void update(String stockSymbol,double newPrice) {
        System.out.println("Investor " + investorName +
                " notified: " + stockSymbol + " price changed to $" + newPrice);
    }
}
