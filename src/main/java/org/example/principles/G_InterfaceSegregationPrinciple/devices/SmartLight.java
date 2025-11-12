package org.example.principles.G_InterfaceSegregationPrinciple.devices;

import org.example.principles.G_InterfaceSegregationPrinciple.controllers.RegistrationController;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.ColorAdjustable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.Dimmable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.LightAdjustable;

public class SmartLight extends SmartDevice implements LightAdjustable, ColorAdjustable, Dimmable {
    private boolean smartLightState;
    private String smartLightColor;
    private int smartLightDimLevel;

    public SmartLight(int lightId, String lightName, boolean smartLightState, String smartLightColor, int smartLightDimLevel) {
        super(lightId, lightName);
        this.smartLightState = smartLightState;
        this.smartLightColor = smartLightColor;
        this.smartLightDimLevel = smartLightDimLevel;
    }

    @Override
    public void registerCapabilities(RegistrationController registry) {
        registry.registerGeneralDevice(this);
        registry.registerLight(this);
        registry.registerColorLight(this);
        registry.registerDimmable(this);
        System.out.println("Registered device: " + getDeviceName() + " (ID: " + getDeviceId() + ")");
    }

    @Override
    public void turnOn() {
        smartLightState = true;
    }

    @Override
    public void turnOff() {
        smartLightState = false;
    }

    @Override
    public boolean isLightOn() {
        return smartLightState;
    }

    @Override
    public void setSmartLightColor(String color) {
        this.smartLightColor = color;
    }

    @Override
    public String getSmartLightColor() {
        return smartLightColor;
    }

    @Override
    public void setDimLightLevel(int level) {
        this.smartLightDimLevel = level;
    }

    @Override
    public int getSmartLightDimLevel() {
        return smartLightDimLevel;
    }
}
