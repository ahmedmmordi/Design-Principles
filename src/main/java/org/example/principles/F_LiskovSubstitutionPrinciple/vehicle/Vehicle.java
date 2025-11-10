package org.example.principles.F_LiskovSubstitutionPrinciple.vehicle;

public abstract class Vehicle {
    private int vehicleId;
    private String vehicleName;
    private double vehicleHourlyPrice;
    private double lastRentalHours;
    private double lastRentalCost;

    public Vehicle() {}

    public Vehicle(int vehicleId, String vehicleName, double vehicleHourlyPrice) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleHourlyPrice = vehicleHourlyPrice;
    }

    public abstract void move();
    public abstract void stop();

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double getVehicleHourlyPrice() {
        return vehicleHourlyPrice;
    }

    public void setVehicleHourlyPrice(double vehicleHourlyPrice) {
        this.vehicleHourlyPrice = vehicleHourlyPrice;
    }

    public double getLastRentalHours() {
        return lastRentalHours;
    }

    public void setLastRentalHours(double lastRentalHours) {
        this.lastRentalHours = lastRentalHours;
    }

    public double getLastRentalCost() {
        return lastRentalCost;
    }

    public void setLastRentalCost(double lastRentalCost) {
        this.lastRentalCost = lastRentalCost;
    }
}
