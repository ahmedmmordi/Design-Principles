package org.example.principles.G_InterfaceSegregationPrinciple.devices;

import org.example.principles.G_InterfaceSegregationPrinciple.controllers.RegistrationController;

public abstract class SmartDevice {
    private int deviceId;
    private String deviceName;
    private boolean isConnected;

    protected SmartDevice() {}

    public SmartDevice(int deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.isConnected = false;
    }

    public abstract void registerCapabilities(RegistrationController registry);

    public void connectToSmartSystem() {
        this.isConnected = true;
        System.out.println("Device: " + getDeviceName() + " connected.");
    }

    public void disconnectFromSmartSystem() {
        this.isConnected = false;
        System.out.println("Device: " + deviceName + " disconnected.");
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        this.isConnected = connected;
    }
}
