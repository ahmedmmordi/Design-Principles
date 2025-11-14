package org.example.principles.H_DependencyInversionPrinciple.Solution.model;

import org.example.principles.H_DependencyInversionPrinciple.Solution.exception.CannotRemoveFavouritesException;
import org.example.principles.H_DependencyInversionPrinciple.Solution.exception.PlaylistNotFoundException;
import org.example.principles.H_DependencyInversionPrinciple.Solution.logging.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private static int nextUserId = 1;

    private final int userId;
    private String userName;
    private List<Playlist> userPlaylists;
    private FavouritesPlaylist userFavourites;
    private Logger logger;

    public User(String userName, Logger logger) {
        this.userId = nextUserId++;
        this.userName = userName;
        this.userPlaylists = new ArrayList<>();
        this.userFavourites = new FavouritesPlaylist();
        this.userPlaylists.add(this.userFavourites);
        this.logger = logger;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addUserPlaylist(Playlist playlist) {
        for (Playlist p : this.userPlaylists) {
            if (p == playlist || p.getPlaylistName().equalsIgnoreCase(playlist.getPlaylistName())) {
                logger.log("User '" + this.userName + "' already has a playlist named '" + playlist.getPlaylistName() + "'. Skipping addition.");
                return;
            }
        }
        userPlaylists.add(playlist);
        logger.log("User '" + this.userName + "' added playlist '" + playlist.getPlaylistName() + "'");
    }

    public void removePlaylist(Playlist playlist) {
        if (playlist == userFavourites) {
            throw new CannotRemoveFavouritesException();
        }
        else if (!userPlaylists.contains(playlist)) {
            throw new PlaylistNotFoundException(playlist.getPlaylistName());
        }
        userPlaylists.remove(playlist);
        logger.log("Playlist '" + playlist.getPlaylistName() + "' has been removed.");
    }

    public List<Playlist> getUserPlaylists() {
        return Collections.unmodifiableList(userPlaylists);
    }

    public FavouritesPlaylist getUserFavourites() {
        return userFavourites;
    }

    public void addSongToFavourites(Song song) {
        userFavourites.addFavouriteSong(song);
    }

    public void removeSongFromFavourites(Song song) {
        userFavourites.removeFavouriteSong(song);
    }
}
