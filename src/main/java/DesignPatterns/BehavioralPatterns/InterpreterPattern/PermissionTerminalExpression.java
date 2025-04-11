package DesignPatterns.BehavioralPatterns.InterpreterPattern;

public class PermissionTerminalExpression implements Expression {
    private String permission;

    public PermissionTerminalExpression(String permission) {
        this.permission = permission;
    }

    @Override
    public boolean interpret(UserContext context) {
        return context.hasPermission(permission);
    }
}
