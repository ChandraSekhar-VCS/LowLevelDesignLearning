package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class Level3SupportHandler extends SupportHandler{
    @Override
    public void handleRequest(SupportRequest request) {
        if(request.issueType.equals(IssueType.critical)){
            System.out.println("Level 3 handled the request: " + request.description);
        }
        else{
            System.out.println("The issue has never been encountered in the past, We request you to give us some time to get back to you");
            if (getNextHandler() != null) {
                getNextHandler().handleRequest(request);
            }
        }
    }
}
