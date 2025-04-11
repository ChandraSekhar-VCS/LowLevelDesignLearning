package DesignPatterns.BehavioralPatterns.CommandPattern;

public class PauseCommand implements Command {
    private MediaPlayer mediaPlayer;
    public PauseCommand(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void execute() {
        mediaPlayer.pause();
    }
}
