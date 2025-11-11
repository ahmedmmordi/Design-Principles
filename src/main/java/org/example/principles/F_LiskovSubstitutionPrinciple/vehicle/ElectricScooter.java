package org.example.principles.F_LiskovSubstitutionPrinciple.vehicle;

import org.example.principles.F_LiskovSubstitutionPrinciple.exceptions.ExceedsMaxRentalHoursException;
import org.example.principles.F_LiskovSubstitutionPrinciple.calculator.CostCalculator;

public class ElectricScooter extends Vehicle implements CostCalculator {
    public ElectricScooter(int vehicleId, String vehicleName, double vehicleHourlyPrice) {
        super(vehicleId, vehicleName, vehicleHourlyPrice);
    }

    @Override
    public void move() {
        System.out.println("ElectricScooter is moving.");
    }

    @Override
    public void stop() {
        System.out.println("ElectricScooter has stopped.");
    }

    @Override
    public void rent(double hours) {
        if (hours > 8) {
             throw new ExceedsMaxRentalHoursException("Cannot rent ElectricScooter for more than 8 hours.");
        }
        this.calculate(this, hours);
        System.out.println("ElectricScooter Rented Successfully for $" + this.getLastRentalCost());
    }

    @Override
    public void cancelRent() {
        System.out.println("Renting of Vehicle with ID " + this.getVehicleId() + " has been cancelled.\n");
    }

    @Override
    public double calculate(Vehicle vehicle, double hours) {
        this.setLastRentalHours(hours);
        this.setLastRentalCost(hours * vehicle.getVehicleHourlyPrice());
        return this.getLastRentalCost();
    }
}
