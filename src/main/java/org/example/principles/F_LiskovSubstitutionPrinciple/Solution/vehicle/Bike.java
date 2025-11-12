package org.example.principles.F_LiskovSubstitutionPrinciple.Solution.vehicle;

import org.example.principles.F_LiskovSubstitutionPrinciple.Solution.calculator.CostCalculator;

public class Bike extends Vehicle implements CostCalculator {
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
