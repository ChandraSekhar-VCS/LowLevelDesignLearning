package DesignPatterns.StructuralPatterns.AdapterPattern;

/**
 * MediaAdapter implements the MediaPlayer interface.
 * It adapts VlcPlayer or Mp4Player to be used where MediaPlayer is expected.
 */
public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer mediaPlayer;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            mediaPlayer = new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            mediaPlayer = new Mp4Player();
        }

        if(mediaPlayer != null){
            mediaPlayer.advancedPlay(fileName);
        }
    }
}
