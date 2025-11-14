package org.example.principles.H_DependencyInversionPrinciple.Solution.printer;

import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Playlist;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Song;

import java.util.List;

public interface Printer {
    void printSong(Song song);
    void printPlaylist(Playlist playlist);
    void printUserPlaylistName(List<Playlist> playlists);
}
