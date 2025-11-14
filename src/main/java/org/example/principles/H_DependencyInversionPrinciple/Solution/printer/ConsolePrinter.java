package org.example.principles.H_DependencyInversionPrinciple.Solution.printer;

import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Playlist;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Song;

import java.util.List;

public class ConsolePrinter implements Printer {
    @Override
    public void printSong(Song song) {
        System.out.println("      Song Info:");
        System.out.println("        - ID: " + song.getSongId());
        System.out.println("        - Name: " + song.getSongName());
        System.out.println("        - Artist: " + song.getSongArtistName());
        System.out.println("        - Source: " + song.getSourceTag());
    }

    @Override
    public void printPlaylist(Playlist playlist) {
        System.out.println(playlist.getPlaylistName() + " Playlist Info:");
        System.out.println("  - ID: " + playlist.getPlaylistId());
        System.out.println("  - Name: " + playlist.getPlaylistName());
        System.out.println("  - Source: " + playlist.getSourceTag());
        System.out.println("  - Songs in the playlist:");
        for(Song song : playlist.getPlaylistSongs()) {
            printSong(song);
        }
        System.out.println("-----------------------------------------");
    }

    @Override
    public void printUserPlaylistName(List<Playlist> playlists) {
        System.out.println("User Playlists:");
        for(Playlist playlist : playlists) {
            System.out.println("  - " +  playlist.getPlaylistName());
        }
    }
}
