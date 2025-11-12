package org.example.principles.F_LiskovSubstitutionPrinciple.Solution;

import org.example.principles.F_LiskovSubstitutionPrinciple.Solution.printer.PaperPrinter;
import org.example.principles.F_LiskovSubstitutionPrinciple.Solution.rental.RentalManager;
import org.example.principles.F_LiskovSubstitutionPrinciple.Solution.vehicle.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager(new PaperPrinter());

        Vehicle myCar = new Car(1, "BMW Car", 10);
        rentPrintCancel(rentalManager, myCar, 10);

        Vehicle myBike = new Bike(2, "Pro Bike", 5);
        rentPrintCancel(rentalManager, myBike, 10);

        Vehicle myTruck = new Truck(3, "Heavy Loads Truck", 20, 25);
        rentPrintCancel(rentalManager, myTruck, 10);

        Vehicle myElectricScooter = new ElectricScooter(4, "E-Scooter", 3);
        // rentPrintCancel(rentalManager, myElectricScooter, 10); // Will throw an exception because renting an ElectricScooter is limited to 8 hours according to business logic
        rentPrintCancel(rentalManager, myElectricScooter, 8);

        rentalManager.calculateRentalCostForAListOfVehicles(List.of(myCar,  myBike, myTruck, myElectricScooter)); // 100 + 50 + 225 + 24 = 399
    }

    private static void rentPrintCancel(RentalManager rentalManager, Vehicle vehicle, double hours) {
        rentalManager.rentVehicle(vehicle, hours);
        rentalManager.printVehicleRentalSummary(vehicle);
        rentalManager.cancelRentVehicle(vehicle);
        System.out.println("----------------------------------------------------");
    }
}
