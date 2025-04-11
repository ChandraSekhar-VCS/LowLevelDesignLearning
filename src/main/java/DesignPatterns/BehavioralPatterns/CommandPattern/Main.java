package DesignPatterns.BehavioralPatterns.CommandPattern;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        Command playCommand = new PlayCommand(mediaPlayer);
        Command stopCommand = new StopCommand(mediaPlayer);
        Command pauseCommand = new PauseCommand(mediaPlayer);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.submitCommand(playCommand);
        remoteControl.submitCommand(pauseCommand);
        remoteControl.submitCommand(stopCommand);

        remoteControl.executeAllCommands();
    }
}
