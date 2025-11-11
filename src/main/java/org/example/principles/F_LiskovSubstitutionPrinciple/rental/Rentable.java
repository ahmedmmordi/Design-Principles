package org.example.principles.F_LiskovSubstitutionPrinciple.rental;

public interface Rentable {
    void rent(double hours);
    void cancelRent();
}
