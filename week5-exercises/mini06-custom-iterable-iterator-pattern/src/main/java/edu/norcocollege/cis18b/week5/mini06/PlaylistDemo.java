package edu.norcocollege.cis18b.week5.mini06;

public class PlaylistDemo {

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.add(new PlaylistItem("Song A"));
        playlist.add(new PlaylistItem("Song B"));
        playlist.add(new PlaylistItem("Song C"));

        for (PlaylistItem item : playlist) {
            System.out.println("Playing: " + item);
        }
    }
}