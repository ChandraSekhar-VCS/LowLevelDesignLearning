package DesignPatterns.BehavioralPatterns.IteratorPattern;

public class Song {
    private String songName;
    private String artistName;

    public Song(String songName, String artistName) {
        this.songName = songName;
        this.artistName = artistName;
    }
    public String getSongName() {
        return songName;
    }
    public String getArtistName() {
        return artistName;
    }
}
