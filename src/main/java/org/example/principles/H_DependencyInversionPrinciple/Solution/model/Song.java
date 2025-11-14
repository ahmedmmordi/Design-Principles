package org.example.principles.H_DependencyInversionPrinciple.Solution.model;

public class Song {
    private static int nextSongId = 1;

    private final int songId;
    private String songName;
    private String songArtistName;
    private String sourceTag;
    private boolean isFavourite;

    public Song(String songName, String songArtistName, String sourceTag) {
        this.songId = nextSongId++;
        this.songName = songName;
        this.songArtistName = songArtistName;
        this.sourceTag = sourceTag;
        this.isFavourite = false;
    }

    public Song(String songName, String songArtistName) {
        this(songName, songArtistName, "UnKnown");
    }

    public Song(String songName) {
        this(songName, "UnKnown", "UnKnown");
    }

    public int getSongId() {
        return songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongArtistName() {
        return songArtistName;
    }

    public void setSongArtistName(String songArtistName) {
        this.songArtistName = songArtistName;
    }

    public void setSourceTag(String sourceTag) {
        this.sourceTag = sourceTag;
    }

    public String getSourceTag() {
        return sourceTag;
    }

    public void markSongAsFavourite() {
        this.isFavourite = true;
    }

    public void unmarkSongAsFavourite() {
        this.isFavourite = false;
    }
}
