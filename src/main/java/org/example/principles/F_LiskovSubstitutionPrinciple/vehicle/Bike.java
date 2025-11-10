package org.example.principles.F_LiskovSubstitutionPrinciple.vehicle;

import org.example.principles.F_LiskovSubstitutionPrinciple.rental.Rentable;
import org.example.principles.F_LiskovSubstitutionPrinciple.calculator.CostCalculator;

public class Bike extends Vehicle implements Rentable, CostCalculator {
    public Bike(int vehicleId, String vehicleName, double vehicleHourlyPrice) {
        super(vehicleId, vehicleName, vehicleHourlyPrice);
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped");
    }

    @Override
    public void rent(double hours) {
        this.calculate(this, hours);
        System.out.println("Bike Rented Successfully for $" + this.getLastRentalCost());
    }

    @Override
    public double calculate(Vehicle vehicle, double hours) {
        this.setLastRentalHours(hours);
        this.setLastRentalCost(hours * vehicle.getVehicleHourlyPrice());
        return this.getLastRentalCost();
    }
}
