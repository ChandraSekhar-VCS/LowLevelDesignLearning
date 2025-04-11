package DesignPatterns.BehavioralPatterns.StrategyPattern.strategy;

public class LowerCaseFormatter implements TextFormatStrategy {
    @Override
    public String format(String text) {
        text  = text.toLowerCase();
        return text;
    }
}
