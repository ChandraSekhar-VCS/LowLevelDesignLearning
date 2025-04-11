package DesignPatterns.BehavioralPatterns.IteratorPattern;

public class Main {
    public static void main(String[] args) {
        SongsCollection collection = new SongsCollection(3);
        collection.addSong(new Song("Hall of Fame" ,"VCS"));
        collection.addSong(new Song("The Fall" ,"VCS"));
        collection.addSong(new Song("The Rise" ,"VCS"));

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            Song song = (Song) iterator.next();
            System.out.println("Song: " + song.getSongName() + "Artist: " + song.getArtistName());
        }
    }
}
