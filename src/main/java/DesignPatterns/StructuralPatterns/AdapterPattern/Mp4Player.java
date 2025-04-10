package DesignPatterns.StructuralPatterns.AdapterPattern;

/**
 * Mp4Player class that implements the AdvancedPlayer interface
 * supports only Mp4 audio types
 */
public class Mp4Player implements  AdvancedMediaPlayer {
    String audioType =  "mp4";
    @Override
    public void advancedPlay(String fileName) {
        System.out.println("Playing "+fileName + "\nType:  " + audioType);
    }
}
