package DesignPatterns.BehavioralPatterns.StrategyPattern.strategy;

public class ReverseFormatter implements TextFormatStrategy{
    @Override
    public String format(String text) {
        String result = "";
        for(int i = text.length() - 1; i >= 0; i--){
            result += text.charAt(i);
        }
        return result;
    }
}
