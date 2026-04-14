package edu.norcocollege.cis18b.week5.mini06;

public class PlaylistItem {
    private final String title;

    public PlaylistItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}