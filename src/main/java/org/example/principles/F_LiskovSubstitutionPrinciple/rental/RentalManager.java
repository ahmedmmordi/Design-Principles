package org.example.principles.F_LiskovSubstitutionPrinciple.rental;

import org.example.principles.F_LiskovSubstitutionPrinciple.printer.RentalReportPrinter;
import org.example.principles.F_LiskovSubstitutionPrinciple.vehicle.Vehicle;

import java.util.List;

public class RentalManager {
    private final RentalReportPrinter rentalReportPrinter;
    public RentalManager(RentalReportPrinter rentalReportPrinter) {
        this.rentalReportPrinter = rentalReportPrinter;
    }

    public void rentVehicle(Rentable vehicle, double hours) {
        vehicle.rent(hours);
    }

    public void cancelRentVehicle(Vehicle vehicle) {
        System.out.println("Vehicle with ID " + vehicle.getVehicleId() + " has been cancelled.\n");
    }

    public void printVehicleRentalSummary(Vehicle vehicle) {
        rentalReportPrinter.print(vehicle);
    }

    public void calculateRentalCostForAListOfVehicles(List<Vehicle> vehicles) {
        System.out.print("The total cost of the list of vehicles is: $" + vehicles.stream().mapToDouble(Vehicle::getLastRentalCost).sum());
    }
}
