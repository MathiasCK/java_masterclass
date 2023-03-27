package ex.section8;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListChallenge {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<Song> playlist = new LinkedList<Song>();

        Album album = new Album();
        album.addSong(new Song("song1", 1));
        album.addSong(new Song("song11", 11));
        album.addSong(new Song("song111", 111));

        addAlbumToPlaylist(album, playlist);

        play(playlist);
    }

    public static void printSongsInPlaylist(LinkedList<Song> playlist) {
        playlist.forEach(item -> System.out.println("Song : " + item.getName()));
    }

    public static void addAlbumToPlaylist(Album album, LinkedList<Song> playlist) {
        // album.getAlbums().forEach(song -> playlist.add(song));
        playlist.addAll(album.getAlbums());
    }

    public static void displayMenu() {
        System.out.println("Options: \n" +
                "Press 0 to quit\n" +
                "Press 1 to play next song\n" +
                "Press 2 to play previous song\n" +
                "Press 3 to replay song\n" +
                "Press 4 to display all songs in playlist\n" +
                "Press 5 to print menu options\n" +
                "Press 6 to delete current song"
                );
    }

    public static void printCurrentSong(ListIterator<Song> i) {
        System.out.println("Now playing " + i.next().getName());
    }

    public static void play(LinkedList<Song> playlist) {
        ListIterator<Song> i = playlist.listIterator();

        if(playlist.isEmpty()) {
            System.out.println("No songs in playlist!");
            return;
        }
        System.out.println("Now playing: " + i.next().getName());

        boolean quit = false;
        boolean goingForward = true;

        displayMenu();

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Your choice: ");
            switch(action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(i.hasNext()) {
                            i.next();
                        }
                        goingForward = true;
                    }
                    if(!i.hasNext()) {
                        System.out.println("End of playlist - now playing " +  playlist.getLast().getName());
                        goingForward = false;
                        break;
                    }
                    printCurrentSong(i);
                    break;
                case 2:
                    if(goingForward) {
                        if(i.hasPrevious()) {
                            i.previous();
                        }
                        goingForward = false;
                    }
                    if(!i.hasPrevious()) {
                        System.out.println("Start of playlist - now playing " + playlist.getFirst().getName());
                        goingForward = false;
                        break;
                    }
                    printCurrentSong(i);
                    break;
                case 3:
                    System.out.println("Now replaying " + i.previous().getName());
                    break;
                case 4:
                    printSongsInPlaylist(playlist);
                    break;
                case 5:
                    displayMenu();
                    break;
                case 6:
                    if(!playlist.isEmpty()) {
                        i.remove();
                        System.out.println("Song deleted!");
                        if(!i.hasPrevious()) {
                            System.out.println("Start of playlist - now playing " + playlist.getFirst().getName());
                        }
                        printCurrentSong(i);
                        break;
                    }
                    System.out.println("Playlist is empty");
                    break;
                default:
                    System.out.println("Invalid number!");
                    displayMenu();
                    break;
            }
        }
        System.out.println("Quit!");
    }

}
