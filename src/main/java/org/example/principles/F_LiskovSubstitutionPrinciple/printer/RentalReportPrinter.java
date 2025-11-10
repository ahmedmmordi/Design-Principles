package org.example.principles.F_LiskovSubstitutionPrinciple.printer;

import org.example.principles.F_LiskovSubstitutionPrinciple.vehicle.Vehicle;

public interface RentalReportPrinter {
    void print(Vehicle vehicle);
}
