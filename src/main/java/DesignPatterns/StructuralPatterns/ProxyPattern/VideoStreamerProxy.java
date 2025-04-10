package DesignPatterns.StructuralPatterns.ProxyPattern;

public class VideoStreamerProxy implements VideoStreamer{
    private boolean isPremium;
    private VideoStreamer streamer;
    public VideoStreamerProxy(String userType) {
        if(userType.equals("Premium")){
            isPremium = true;
        }
        streamer = new RealVideoStreamer();
    }
    @Override
    public void streamVideo(String videoName, String quality) throws Exception {
        if(isPremium){
            streamer.streamVideo(videoName, quality);
        }
        else{
            if(quality.equals("HD") ||  quality.equals("4K")){
                throw new Exception("You are not premium, you can only stream in SD quality");
            }
            else{
                streamer.streamVideo(videoName, quality);
            }
        }
    }
}
