package org.example.principles.H_DependencyInversionPrinciple.Solution.exception;

public class SongAlreadyFavouriteException extends RuntimeException {
    public SongAlreadyFavouriteException(String songName) {
        super("Song '" + songName + "' is already marked as favourite.");
    }
}
