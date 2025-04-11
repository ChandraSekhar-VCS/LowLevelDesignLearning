package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class Level2SupportHandler extends SupportHandler{
    @Override
    public void handleRequest(SupportRequest request) {
        if(request.issueType.equals(IssueType.technical)){
            System.out.println("Level 2 handled the request: " + request.description);
        }
        else{
            System.out.println("Level 2 cannot handle this request, passing to the next");
            if (getNextHandler() != null) {
                getNextHandler().handleRequest(request);
            }
        }
    }
}
