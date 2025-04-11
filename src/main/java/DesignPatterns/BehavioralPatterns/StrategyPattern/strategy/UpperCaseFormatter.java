package DesignPatterns.BehavioralPatterns.StrategyPattern.strategy;

public class UpperCaseFormatter implements TextFormatStrategy {
    @Override
    public String format(String text) {
        text = text.toUpperCase();
        return text;
    }
}
