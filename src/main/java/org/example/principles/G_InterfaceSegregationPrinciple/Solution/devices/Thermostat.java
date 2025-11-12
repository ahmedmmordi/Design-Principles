package org.example.principles.G_InterfaceSegregationPrinciple.Solution.devices;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.controllers.RegistrationController;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.scheduling.Schedulable;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.environment.TemperatureControllable;

import java.time.LocalDateTime;

public class Thermostat extends SmartDevice implements TemperatureControllable, Schedulable {
    private double thermostatTemperature;
    private LocalDateTime thermostatTime;

    public Thermostat(int thermostatId, String thermostatName, double thermostatTemperature, LocalDateTime thermostatTime) {
        super(thermostatId, thermostatName);
        this.thermostatTemperature = thermostatTemperature;
        this.thermostatTime = thermostatTime;
    }

    @Override
    public void registerCapabilities(RegistrationController registry) {
        registry.registerGeneralDevice(this);
        registry.registerThermostat(this);
        registry.registerSchedulable(this);
        System.out.println("Registered device: " + getDeviceName() + " (ID: " + getDeviceId() + ")");
    }

    @Override
    public void setTemperature(double temperature) {
        this.thermostatTemperature = temperature;
    }

    @Override
    public double getTemperature() {
        return thermostatTemperature;
    }

    @Override
    public void schedule(LocalDateTime time) {
        this.thermostatTime = time;
    }

    @Override
    public LocalDateTime getTime() {
        return thermostatTime;
    }
}
