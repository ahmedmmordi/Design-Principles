package org.example.principles.H_DependencyInversionPrinciple.Solution.exception;

public class CannotRemoveFavouritesException extends RuntimeException {
    public CannotRemoveFavouritesException() {
        super("Cannot remove the Favourites playlist.");
    }
}
