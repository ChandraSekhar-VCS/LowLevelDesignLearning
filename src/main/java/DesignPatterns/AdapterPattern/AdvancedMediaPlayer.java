package DesignPatterns.AdapterPattern;

/**
 * AdvancedMediaPlayer interface is the Adapter interface in the Adapter Pattern
 * defines a advancedPlay() method that takes fileName(String) as a parameter
 * the VlcPlayer and Mp4Player classes implement the AdvancedMediaPlayer interface and provide their own implementation of advancedPaly()
 */
public interface AdvancedMediaPlayer {
    void advancedPlay(String fileName);
}
