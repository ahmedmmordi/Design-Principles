package org.example.principles.G_InterfaceSegregationPrinciple.devices;

import org.example.principles.G_InterfaceSegregationPrinciple.controllers.RegistrationController;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.security.Lockable;

public class SmartLock extends SmartDevice implements Lockable {
    private boolean smartLockState;

    public SmartLock(int smartLockId, String smartLockName, boolean smartLockState) {
        super(smartLockId, smartLockName);
        this.smartLockState = smartLockState;
    }

    @Override
    public void registerCapabilities(RegistrationController registry) {
        registry.registerGeneralDevice(this);
        registry.registerLock(this);
        System.out.println("Registered device: " + getDeviceName() + " (ID: " + getDeviceId() + ")");
    }

    @Override
    public void lock() {
        this.smartLockState = true;
    }

    @Override
    public void unlock() {
        this.smartLockState = false;
    }

    @Override
    public boolean isLocked() {
        return smartLockState;
    }
}
