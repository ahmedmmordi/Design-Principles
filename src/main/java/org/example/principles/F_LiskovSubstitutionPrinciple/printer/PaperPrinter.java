package org.example.principles.F_LiskovSubstitutionPrinciple.printer;

import org.example.principles.F_LiskovSubstitutionPrinciple.vehicle.Vehicle;

public class PaperPrinter implements RentalReportPrinter {
    @Override
    public void print(Vehicle vehicle) {
        System.out.println("\n" + vehicle.getVehicleName() + " Renting Summary:");
        System.out.println("  - Vehicle ID: " + vehicle.getVehicleId());
        System.out.println("  - Vehicle Name: " + vehicle.getVehicleName());
        System.out.println("  - Vehicle Hourly Price: $" + vehicle.getVehicleHourlyPrice());
        System.out.println("  - Vehicle Hours Rented: " + vehicle.getLastRentalHours());
        System.out.println("  - Vehicle Total Cost: $" + vehicle.getLastRentalCost());
        System.out.println();
    }
}
