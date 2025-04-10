package DesignPatterns.StructuralPatterns.AdapterPattern;

/**
 * VlcPlayer class implements AdvancedPlayer interface
 * supports only vlc audion type
 */
public class VlcPlayer implements  AdvancedMediaPlayer {
    String audioType = "vlc";
    @Override
    public void advancedPlay(String fileName) {
        System.out.println("Playing "+fileName + "\nType:  " + audioType);
    }
}
