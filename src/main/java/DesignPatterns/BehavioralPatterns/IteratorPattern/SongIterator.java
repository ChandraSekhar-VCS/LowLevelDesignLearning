package DesignPatterns.BehavioralPatterns.IteratorPattern;

public class SongIterator implements  Iterator {
    private Song[] songs;
    private int index = 0;
    public SongIterator(Song[] songs) {
        this.songs = songs;
    }
    @Override
    public boolean hasNext() {
        if (index < songs.length) {
            return true;
        }
        return false;
    }
    @Override
    public Song next() {
        return songs[index++];
    }
}
