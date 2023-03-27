package ex.section8;

import java.util.ArrayList;

public class Album {

    private final ArrayList<Song> albumSongs = new ArrayList<Song>();

    public Album() {}

    public void addSong(Song song) {
        this.albumSongs.add(song);
    }

    public ArrayList<Song> getAlbums() {
        return albumSongs;
    }

    public void displaySongsForAlbum() {
        albumSongs.forEach(song -> System.out.println("Song: " + song.getName()));
    }
}
