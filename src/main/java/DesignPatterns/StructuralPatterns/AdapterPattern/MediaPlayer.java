package DesignPatterns.StructuralPatterns.AdapterPattern;

/**
 * The MediaPlayer interface is the target interface in the Adapter Pattern.
 * Classes implementing this can play audio files based on type and filename.
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
