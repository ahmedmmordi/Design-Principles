package org.example.principles.H_DependencyInversionPrinciple.Solution.exception;

public class PlaylistNotFoundException extends RuntimeException {
    public PlaylistNotFoundException(String playlistName) {
        super("Playlist '" + playlistName + "' was not found.");
    }
}
