package org.example.principles.F_LiskovSubstitutionPrinciple.printer;

import org.example.principles.F_LiskovSubstitutionPrinciple.vehicle.Vehicle;

public class PaperPrinter implements RentalReportPrinter {
    @Override
    public void print(Vehicle vehicle) {
        System.out.println("\n" + "Vehicle Renting Summary:");
        System.out.println("  - ID: " + vehicle.getVehicleId());
        System.out.println("  - Name: " + vehicle.getVehicleName());
        System.out.println("  - Hourly Price: $" + vehicle.getVehicleHourlyPrice());
        System.out.println("  - Hours Rented: " + vehicle.getLastRentalHours());
        System.out.println("  - Total Cost: $" + vehicle.getLastRentalCost());
        System.out.println();
    }
}
