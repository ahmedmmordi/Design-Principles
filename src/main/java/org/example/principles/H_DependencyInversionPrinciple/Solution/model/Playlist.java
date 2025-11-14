package org.example.principles.H_DependencyInversionPrinciple.Solution.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private static int nextPlaylistId = 1;

    private final int playlistId;
    private String playlistName;
    private String sourceTag;
    private List<Song> playlistSongs;

    public Playlist(String playlistName, String sourceTag) {
        this.playlistId = nextPlaylistId++;
        this.playlistName = playlistName;
        this.sourceTag = sourceTag;
        this.playlistSongs = new ArrayList<>();
    }

    public Playlist(String playlistName) {
        this(playlistName, "UnKnown");
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public void setSourceTag(String sourceTag) {
        this.sourceTag = sourceTag;
    }

    public String getSourceTag() {
        return sourceTag;
    }

    public List<Song> getPlaylistSongs() {
        return Collections.unmodifiableList(playlistSongs);
    }

    public void addSong(Song song) {
        playlistSongs.add(song);
    }

    public void removeSong(Song song) {
        playlistSongs.remove(song);
    }

    public Song findSongById(int songId) {
        for (Song song : this.playlistSongs) {
            if (song.getSongId() == songId) {
                return song;
            }
        }
        return null;
    }

    public void clearPlaylist() {
        playlistSongs.clear();
    }
}
