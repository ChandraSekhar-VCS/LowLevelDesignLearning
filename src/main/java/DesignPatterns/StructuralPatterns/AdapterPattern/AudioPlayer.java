package DesignPatterns.StructuralPatterns.AdapterPattern;

/**
 * AudioPlayer implements MediaPlayer and plays mp3 directly.
 * For other formats like mp4 and vlc, it uses the MediaAdapter.
 */
public class AudioPlayer implements  MediaPlayer {
    MediaAdapter mediaAdapter;
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing: "+fileName + "\nType: " + audioType);
        }
        else if(audioType.equalsIgnoreCase("mp4") ||audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Unsupported Audio Type" + audioType);
        }
    }
}
