package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class Level1SupportHandler extends SupportHandler {
    @Override
    public void handleRequest(SupportRequest request) {
        if(request.issueType.equals(IssueType.general)){
            System.out.println("Level 1 handled the request: " + request.description);
        }
        else{
            System.out.println("Level 1 cannot handle this request, passing to the next");
            if (getNextHandler() != null) {
                getNextHandler().handleRequest(request);
            }
        }
    }
}
