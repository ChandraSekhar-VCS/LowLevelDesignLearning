package DesignPatterns.BehavioralPatterns.CommandPattern;

public class StopCommand implements Command {
    private MediaPlayer mediaPlayer;
    public StopCommand(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void execute() {
        mediaPlayer.stop();
    }
}
