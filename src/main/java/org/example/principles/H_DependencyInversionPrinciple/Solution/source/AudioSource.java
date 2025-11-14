package org.example.principles.H_DependencyInversionPrinciple.Solution.source;

import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Playlist;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Song;

public interface AudioSource {
    Song loadSong(String sourcePath);
    Playlist loadPlaylist(String sourcePath);
}
