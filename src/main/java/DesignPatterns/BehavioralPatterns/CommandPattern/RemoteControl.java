package DesignPatterns.BehavioralPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commandList = new ArrayList<>();
    public void submitCommand(Command command) {
        commandList.add(command);
    }
    public void executeAllCommands() {
        for(Command c : commandList) {
            c.execute();
        }
        commandList.clear();
    }
}
