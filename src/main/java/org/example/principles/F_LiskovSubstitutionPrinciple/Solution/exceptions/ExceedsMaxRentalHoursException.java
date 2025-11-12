package org.example.principles.F_LiskovSubstitutionPrinciple.Solution.exceptions;

public class ExceedsMaxRentalHoursException extends RuntimeException {
    public ExceedsMaxRentalHoursException(String message) {
        super(message);
    }
}
