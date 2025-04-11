package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

import static DesignPatterns.BehavioralPatterns.ChainOfResponsibility.IssueType.*;

public class Main {
    public static void main(String[] args) {
        SupportHandler L1Handler = new Level1SupportHandler();
        SupportHandler L2Handler = new Level2SupportHandler();
        SupportHandler L3Handler = new Level3SupportHandler();

        SupportRequest r1 = new SupportRequest(general, "How do I reset my password?");
        SupportRequest r2 = new SupportRequest(technical, "App crashes when I upload a file.");
        SupportRequest r3 = new SupportRequest(critical, "System outage! Clients can't access data.");
        L1Handler.setNextHandler(L2Handler).setNextHandler(L3Handler);
        L1Handler.handleRequest(r1);
        L1Handler.handleRequest(r2);
        L1Handler.handleRequest(r3);

    }
}
