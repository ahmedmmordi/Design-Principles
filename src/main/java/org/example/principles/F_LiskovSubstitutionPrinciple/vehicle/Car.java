package org.example.principles.F_LiskovSubstitutionPrinciple.vehicle;

import org.example.principles.F_LiskovSubstitutionPrinciple.rental.Rentable;
import org.example.principles.F_LiskovSubstitutionPrinciple.calculator.CostCalculator;

public class Car extends Vehicle implements Rentable, CostCalculator {
    public Car(int vehicleId, String vehicleName, double vehicleHourlyPrice) {
        super(vehicleId, vehicleName, vehicleHourlyPrice);
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }

    @Override
    public void rent(double hours) {
        this.calculate(this, hours);
        System.out.println("Car Rented Successfully for $" + this.getLastRentalCost());
    }

    @Override
    public double calculate(Vehicle vehicle, double hours) {
        this.setLastRentalHours(hours);
        this.setLastRentalCost(hours * vehicle.getVehicleHourlyPrice());
        return this.getLastRentalCost();
    }
}
