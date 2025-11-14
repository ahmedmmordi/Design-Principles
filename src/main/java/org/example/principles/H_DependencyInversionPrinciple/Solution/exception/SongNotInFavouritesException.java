package org.example.principles.H_DependencyInversionPrinciple.Solution.exception;

public class SongNotInFavouritesException extends RuntimeException {
    public SongNotInFavouritesException(String songName) {
        super("Song '" + songName + "' is not in favourites.");
    }
}
