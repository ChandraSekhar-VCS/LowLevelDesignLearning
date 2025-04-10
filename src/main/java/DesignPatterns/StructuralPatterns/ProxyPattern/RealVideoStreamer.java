package DesignPatterns.StructuralPatterns.ProxyPattern;

public class RealVideoStreamer implements VideoStreamer{
    @Override
    public void streamVideo(String videoName, String quality) throws Exception {
        System.out.println("Streaming video "+videoName+" with quality "+quality);
    }
}
