package org.example.principles.F_LiskovSubstitutionPrinciple.vehicle;

import org.example.principles.F_LiskovSubstitutionPrinciple.calculator.CostCalculator;
import org.example.principles.F_LiskovSubstitutionPrinciple.requirements.RequiresSpecialLicense;

public class Truck extends Vehicle implements RequiresSpecialLicense, CostCalculator {
    private double truckInsurance;

    public Truck(int vehicleId, String vehicleName, double vehicleHourlyPrice, double truckInsurance) {
        super(vehicleId, vehicleName, vehicleHourlyPrice);
        this.truckInsurance = truckInsurance;
    }

    @Override
    public void move() {
        System.out.println("Truck is moving");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped");
    }

    @Override
    public void rent(double hours) {
        this.calculate(this, hours);
        System.out.println("Truck Rented Successfully for $" + this.getLastRentalCost());
    }

    @Override
    public void cancelRent() {
        System.out.println("Renting of Vehicle with ID " + this.getVehicleId() + " has been cancelled.\n");
    }

    @Override
    public String getSpecialLicense() {
        return "Truck Special License TSL-123";
    }

    @Override
    public double calculate(Vehicle vehicle, double hours) {
        this.setLastRentalHours(hours);
        this.setLastRentalCost(hours * vehicle.getVehicleHourlyPrice() + this.getTruckInsurance());
        return this.getLastRentalCost();
    }

    public double getTruckInsurance() {
        return truckInsurance;
    }

    public void setTruckInsurance(double truckInsurance) {
        this.truckInsurance = truckInsurance;
    }
}
