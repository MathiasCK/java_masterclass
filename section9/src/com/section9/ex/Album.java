package com.section9.ex;


import java.util.ArrayList;

public class Album {

    private final SongList songs = new SongList();

    public Album() {}

    public void addSong(Song song) {
        this.songs.addSong(song);
    }

    public ArrayList<Song> getAlbums() {
        return this.songs.getAlbums();
    }

    public void displaySongsForAlbum() {
        this.songs.songs.forEach(song -> System.out.println("Song: " + song.getName()));
    }

    private class SongList {
        private final ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<Song>();
        }

        public void addSong(Song song) {
            songs.add(song);
        }

        public ArrayList<Song> getAlbums() {
            return songs;
        }

        public void displaySongsForAlbum() {
            songs.forEach(song -> System.out.println("Song: " + song.getName()));
        }
    }
}
