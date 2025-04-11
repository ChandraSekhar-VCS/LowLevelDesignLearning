package DesignPatterns.BehavioralPatterns.StrategyPattern;

import DesignPatterns.BehavioralPatterns.StrategyPattern.context.TextEditor;
import DesignPatterns.BehavioralPatterns.StrategyPattern.strategy.CapitalizeFormatter;
import DesignPatterns.BehavioralPatterns.StrategyPattern.strategy.LowerCaseFormatter;
import DesignPatterns.BehavioralPatterns.StrategyPattern.strategy.ReverseFormatter;
import DesignPatterns.BehavioralPatterns.StrategyPattern.strategy.UpperCaseFormatter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text you want to format: ");
        String text = input.nextLine();

        TextEditor editor1 = new TextEditor(new UpperCaseFormatter());
        TextEditor editor2 = new TextEditor(new LowerCaseFormatter());
        TextEditor editor3 = new TextEditor(new CapitalizeFormatter());
        TextEditor editor4 = new TextEditor(new ReverseFormatter());

        String s1 = editor1.publishText(text);
        String s2 = editor2.publishText(text);
        String s3 = editor3.publishText(text);
        String s4 = editor4.publishText(text);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
