package org.example.principles.G_InterfaceSegregationPrinciple.Solution.devices;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.controllers.RegistrationController;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.lighting.LightAdjustable;

public class OldLight extends SmartDevice implements LightAdjustable {
    private boolean oldLightState;

    public OldLight(int oldLightId, String oldLightName, boolean oldLightState) {
        super(oldLightId, oldLightName);
        this.oldLightState = oldLightState;
    }

    @Override
    public void registerCapabilities(RegistrationController registry) {
        registry.registerGeneralDevice(this);
        registry.registerLight(this);
        System.out.println("Registered device: " + getDeviceName() + " (ID: " + getDeviceId() + ")");
    }

    @Override
    public void turnOn() {
        this.oldLightState = true;
    }

    @Override
    public void turnOff() {
        this.oldLightState = false;
    }

    @Override
    public boolean isLightOn() {
        return oldLightState;
    }
}
