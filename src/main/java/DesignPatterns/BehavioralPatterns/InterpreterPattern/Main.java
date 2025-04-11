package DesignPatterns.BehavioralPatterns.InterpreterPattern;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> userPermissions = new HashSet<>();
        userPermissions.add("read");
        userPermissions.add("write");

        UserContext context = new UserContext(userPermissions);

        // Expression: read AND write
        Expression read = new PermissionTerminalExpression("read");
        Expression write = new PermissionTerminalExpression("write");
        Expression readAndWrite = new AndExpression(read, write);
        System.out.println("Expression: read AND write => " + readAndWrite.interpret(context));

        // Expression: read AND delete
        Expression delete = new PermissionTerminalExpression("delete");
        Expression readAndDelete = new AndExpression(read, delete);
        System.out.println("Expression: read AND delete => " + readAndDelete.interpret(context));

        // Expression: read OR delete
        Expression readOrDelete = new OrExpression(read, delete);
        System.out.println("Expression: read OR delete => " + readOrDelete.interpret(context));
    }
}
