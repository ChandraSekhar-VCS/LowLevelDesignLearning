package DesignPatterns.StructuralPatterns.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        VideoStreamer streamer1 = new VideoStreamerProxy("premium");
        VideoStreamer streamer2 = new VideoStreamerProxy("user");

        try{
            streamer1.streamVideo("The Legend - Chandra Sekhar" ,"4k");
            streamer2.streamVideo("The Legend - Chandra Sekhar" ,"HD");
        }
        catch(Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }

        try{
            streamer2.streamVideo("The Legend - Chandra Sekhar" ,"SD");
        }
        catch(Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
