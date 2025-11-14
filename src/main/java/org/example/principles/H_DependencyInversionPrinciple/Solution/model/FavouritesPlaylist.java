package org.example.principles.H_DependencyInversionPrinciple.Solution.model;

import org.example.principles.H_DependencyInversionPrinciple.Solution.exception.SongAlreadyFavouriteException;
import org.example.principles.H_DependencyInversionPrinciple.Solution.exception.SongNotInFavouritesException;

public class FavouritesPlaylist extends Playlist {
    public FavouritesPlaylist() {
        super("Favourites");
    }

    public void addFavouriteSong(Song song) {
        if (super.findSongById(song.getSongId()) != null) {
            throw new SongAlreadyFavouriteException(song.getSongName());
        }
        addSong(song);
        song.markSongAsFavourite();
    }

    public void removeFavouriteSong(Song song) {
        if (super.findSongById(song.getSongId()) == null) {
            throw new SongNotInFavouritesException(song.getSongName());
        }
        removeSong(song);
        song.unmarkSongAsFavourite();
    }
}
