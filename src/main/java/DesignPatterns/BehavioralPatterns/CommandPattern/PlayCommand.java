package DesignPatterns.BehavioralPatterns.CommandPattern;

public class PlayCommand implements Command {
    private MediaPlayer mediaPlayer;
    public PlayCommand(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void execute() {
        mediaPlayer.play();
    }
}
