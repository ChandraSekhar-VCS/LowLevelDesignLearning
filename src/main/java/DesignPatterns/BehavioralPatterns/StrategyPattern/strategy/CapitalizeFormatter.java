package DesignPatterns.BehavioralPatterns.StrategyPattern.strategy;

public class CapitalizeFormatter implements TextFormatStrategy{
    @Override
    public String format(String text) {
        text =  text.substring(0, 1).toUpperCase() + text.substring(1);
        return text;
    }
}
