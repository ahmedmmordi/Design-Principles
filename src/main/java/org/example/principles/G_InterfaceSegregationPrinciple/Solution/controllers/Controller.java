package org.example.principles.G_InterfaceSegregationPrinciple.Solution.controllers;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.devices.SmartDevice;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.lighting.ColorAdjustable;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.lighting.LightAdjustable;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.printing.FullPrinter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Controller {
    private final RegistrationController registry;
    private final FullPrinter fullPrinter;

    public Controller(FullPrinter fullPrinter) {
        this.fullPrinter = fullPrinter;
        this.registry = new RegistrationController();
    }

    public void registerDevice(SmartDevice device) {
        device.registerCapabilities(registry);
    }

    public void connectAllToTheSystem() {
        System.out.println("Connecting all devices to the system...");
        registry.getAllDevices().forEach(SmartDevice::connectToSmartSystem);
        System.out.println("------------------------------------");
    }

    public boolean areAllDeviceOnTheSystem() {
        return registry.getAllDevices().stream().allMatch(SmartDevice::isConnected);
    }

    public void printAllDeviceNamesAndIds() {
        fullPrinter.printAllDeviceNameAndId(registry.getAllDevices());
    }

    public void printAllMethodsInAClass(SmartDevice device) {
        fullPrinter.printAllMethodsOfADevice(device);
    }

    public void printAllCameraState() {
        fullPrinter.printAllCameraState(registry.getCameras());
    }

    public void printAllLightColors() {
        fullPrinter.printAllLightColors(registry.getColorLights());
    }

    public void printAllLightDimLevels() {
        fullPrinter.printAllLightDimLevels(registry.getDimmableLights());
    }

    public void printAllSecurityCameraLog() {
        fullPrinter.printAllMotionDetectionLogs(registry.getMotionCameras());
    }

    public void printAllThermostatTemperature() {
        fullPrinter.printAllThermostatTemperature(registry.getThermostats());
    }

    public void printAllThermostatTime() {
        fullPrinter.printAllThermostatTime(registry.getSchedulables());
    }

    public void printAllLockStates() {
        fullPrinter.printAllLockStates(registry.getLocks());
    }

    public void printAllSprinklerDuration() {
        fullPrinter.printAllSprinklerDuration(registry.getDurations());
    }

    public void printAllLightsOn() {
        fullPrinter.printAllLightState(registry.getLights());
    }

    public void getSmartLights() {
        System.out.println("Smart Light only:");
        for (ColorAdjustable ca : registry.getSmartLights()) {
            SmartDevice device = (SmartDevice) ca;
            System.out.println("  - Name: " + device.getDeviceName() + ", ID: " + device.getDeviceId());
        }
        System.out.println("------------------------------------");
    }

    public void turnAllLightOn() {
        registry.getLights().forEach(light -> {
            light.turnOn();
            System.out.println(((SmartDevice) light).getDeviceName() + " is turned on.");
        });
        System.out.println("------------------------------------");
    }

    public boolean areAllLightOn() {
        return registry.getLights().stream().allMatch(LightAdjustable::isLightOn);
    }

    public void startAllSprinklers() {
        registry.getSprinklers().forEach(s -> {
            s.startWatering();
            System.out.println(((SmartDevice) s).getDeviceName() + " is started.");
        });
        System.out.println("------------------------------------");
    }

    public void setAllThermostatTime(LocalDateTime time) {
        registry.getSchedulables().forEach(s -> {
            s.schedule(time);
            System.out.println(((SmartDevice) s).getDeviceName() + " is set to " + time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        });
        System.out.println("------------------------------------");
    }

    public void lockAllSmartLocks() {
        registry.getLocks().forEach(lock -> {
            lock.lock();
            System.out.println(((SmartDevice) lock).getDeviceName() + " is locked.");
        });
        System.out.println("------------------------------------");
    }

    public String controllerInfoMessage() {
        return "Controller managing " + registry.getAllDevices().size() + " devices.";
    }
}
