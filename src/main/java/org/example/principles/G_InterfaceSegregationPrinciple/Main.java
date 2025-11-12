package org.example.principles.G_InterfaceSegregationPrinciple;

import org.example.principles.G_InterfaceSegregationPrinciple.controllers.Controller;
import org.example.principles.G_InterfaceSegregationPrinciple.devices.SmartDevice;
import org.example.principles.G_InterfaceSegregationPrinciple.printers.ConsoleFullPrinter;
import org.example.principles.G_InterfaceSegregationPrinciple.startup.ProgramStartUp;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SmartDevice> devices = new ProgramStartUp().initializeDevices();
        Controller controller = new Controller(new ConsoleFullPrinter());

        // Register all devices
        devices.forEach(controller::registerDevice);
        System.out.println("------------------------------------");

        // Connect all devices
        System.out.println("All devices connected: " + controller.areAllDeviceOnTheSystem() + "\n------------------------------------");
        controller.connectAllToTheSystem();
        System.out.println("All devices connected: " + controller.areAllDeviceOnTheSystem() + "\n------------------------------------");

        // Print all device names & IDs
        controller.printAllDeviceNamesAndIds();

        // Call grouped methods
        handleLights(controller);
        handleSprinklers(controller);
        handleLocks(controller);
        handleThermostats(controller);
        handleCameras(controller);

        // See all features of a device
        controller.printAllMethodsInAClass(devices.getFirst());

        // Controller info
        System.out.println(controller.controllerInfoMessage());
    }

    private static void handleLights(Controller controller) {
        System.out.println("\n=== LIGHTS ===");
        System.out.println("All lights are on: " + controller.areAllLightOn() + "\n------------------------------------");
        controller.printAllLightsOn();
        controller.getSmartLights();
        controller.turnAllLightOn();
        controller.printAllLightsOn();
        controller.printAllLightColors();
        controller.printAllLightDimLevels();
        System.out.println("------------------------------------");
    }

    private static void handleSprinklers(Controller controller) {
        System.out.println("\n=== SPRINKLERS ===");
        controller.startAllSprinklers();
        controller.printAllSprinklerDuration();
        System.out.println("------------------------------------");
    }

    private static void handleLocks(Controller controller) {
        System.out.println("\n=== LOCKS ===");
        controller.printAllLockStates();
        controller.lockAllSmartLocks();
        controller.printAllLockStates();
        System.out.println("------------------------------------");
    }

    private static void handleThermostats(Controller controller) {
        System.out.println("\n=== THERMOSTATS ===");
        controller.printAllThermostatTime();
        controller.setAllThermostatTime(LocalDateTime.now().plusHours(4).plusMinutes(23));
        controller.printAllThermostatTime();
        controller.printAllThermostatTemperature();
        System.out.println("------------------------------------");
    }

    private static void handleCameras(Controller controller) {
        System.out.println("\n=== CAMERAS ===");
        controller.printAllCameraState();
        controller.printAllSecurityCameraLog();
        System.out.println("------------------------------------");
    }
}
