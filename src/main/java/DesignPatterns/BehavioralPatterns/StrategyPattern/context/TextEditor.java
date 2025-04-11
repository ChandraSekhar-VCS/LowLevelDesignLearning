package DesignPatterns.BehavioralPatterns.StrategyPattern.context;

import DesignPatterns.BehavioralPatterns.StrategyPattern.strategy.TextFormatStrategy;

public class TextEditor {
    private TextFormatStrategy textFormatStrategy;
    public TextEditor(TextFormatStrategy textFormatStrategy) {
        this.textFormatStrategy = textFormatStrategy;
    }
    public String publishText(String text) {
        String result = textFormatStrategy.format(text);
        return  result;
    }
}
