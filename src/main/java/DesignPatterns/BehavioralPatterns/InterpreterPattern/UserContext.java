package DesignPatterns.BehavioralPatterns.InterpreterPattern;

import java.util.Set;

public class UserContext {
    private Set<String> permissions;

    public UserContext(Set<String> permissions) {
        this.permissions = permissions;
    }

    public boolean hasPermission(String permission) {
        return permissions.contains(permission.toLowerCase());
    }
}
