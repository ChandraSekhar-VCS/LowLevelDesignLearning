package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class SupportRequest {
    IssueType issueType;
    String description;
    public  SupportRequest(IssueType issueType, String description) {
        this.issueType = issueType;
        this.description = description;
    }
}
