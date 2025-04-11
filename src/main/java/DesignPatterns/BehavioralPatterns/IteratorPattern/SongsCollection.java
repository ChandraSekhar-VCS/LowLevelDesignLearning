package DesignPatterns.BehavioralPatterns.IteratorPattern;

public class SongsCollection {
    private Song[] songs;
    private int index = 0;
    public SongsCollection(int size) {
        this.songs = new Song[size];
    }
    public void addSong(Song song) {
        songs[index++] = song;
    }
    public Iterator createIterator() {
        return new SongIterator(songs);
    }
}
