package DesignPatterns.BehavioralPatterns.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CartElement> cart = new ArrayList<>();
        cart.add(new Clothing(400));
        cart.add(new Book(100));
        cart.add(new Electronics(2000));
        cart.add(new Clothing(300));
        cart.add(new Electronics(1000));
        cart.add(new Book(200));

        TaxVisitor visitor = new IndiaTaxVisitor();
        for(CartElement cartElement : cart){
            cartElement.accept(visitor);
        }
    }
}
