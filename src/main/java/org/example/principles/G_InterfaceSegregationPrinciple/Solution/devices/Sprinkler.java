package org.example.principles.G_InterfaceSegregationPrinciple.Solution.devices;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.controllers.RegistrationController;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.environment.DurationControllable;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.environment.WateringControllable;

public class Sprinkler extends SmartDevice implements WateringControllable, DurationControllable {
    private boolean sprinklerWateringState;
    private double sprinklerDuration;

    public Sprinkler(int sprinklerId, String sprinklerName, boolean sprinklerWateringState, double sprinklerDuration) {
        super(sprinklerId, sprinklerName);
        this.sprinklerWateringState = sprinklerWateringState;
        this.sprinklerDuration = sprinklerDuration;
    }

    @Override
    public void registerCapabilities(RegistrationController registry) {
        registry.registerGeneralDevice(this);
        registry.registerSprinkler(this);
        registry.registerDuration(this);
        System.out.println("Registered device: " + getDeviceName() + " (ID: " + getDeviceId() + ")");
    }

    @Override
    public void startWatering() {
        this.sprinklerWateringState = true;
    }

    @Override
    public void stopWatering() {
        this.sprinklerWateringState = false;
    }

    @Override
    public void setDuration(double duration) {
        this.sprinklerDuration = duration;
    }

    @Override
    public double getDuration() {
        return sprinklerDuration;
    }

    @Override
    public boolean isWatering() {
        return sprinklerWateringState;
    }
}
