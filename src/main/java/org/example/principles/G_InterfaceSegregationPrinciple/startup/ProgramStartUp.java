package org.example.principles.G_InterfaceSegregationPrinciple.startup;

import org.example.principles.G_InterfaceSegregationPrinciple.devices.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProgramStartUp {
    private final List<SmartDevice> devices;

    public ProgramStartUp() {
        this.devices = new ArrayList<>();
    }

    public List<SmartDevice> initializeDevices() {
        // Old Lights
        devices.add(new OldLight(101, "OL1", false));
        devices.add(new OldLight(102, "OL2", true));
        devices.add(new OldLight(103, "OL3", false));
        devices.add(new OldLight(104, "OL4", true));

        // Smart Lights (Color + Dimmable)
        devices.add(new SmartLight(201, "SL1", true, "Red", 50));
        devices.add(new SmartLight(202, "SL2", false, "Blue", 80));
        devices.add(new SmartLight(203, "SL3", true, "Green", 30));
        devices.add(new SmartLight(204, "SL4", false, "White", 70));
        devices.add(new SmartLight(205, "SL5", true, "Yellow", 100));

        // Basic Cameras
        devices.add(new BasicCamera(301, "BasicCam1", false));
        devices.add(new BasicCamera(302, "BasicCam2", true));
        devices.add(new BasicCamera(303, "BasicCam3", false));

        // Security / Motion Cameras
        devices.add(new SecurityCamera(401, "SecCam1", true, true, 5));
        devices.add(new SecurityCamera(402, "SecCam2", true, true, 8));

        // Sprinklers
        devices.add(new Sprinkler(501, "Spr1", true, 10));
        devices.add(new Sprinkler(502, "Spr2", true, 15));
        devices.add(new Sprinkler(503, "Spr3", true, 20));
        devices.add(new Sprinkler(504, "Spr4", true, 25));

        // Smart Locks
        devices.add(new SmartLock(601, "SLock1", false));
        devices.add(new SmartLock(602, "SLock2", false));
        devices.add(new SmartLock(603, "SLock3", true));

        // Thermostats
        devices.add(new Thermostat(701, "Therm1", 22.5, LocalDateTime.now().plusHours(2)));
        devices.add(new Thermostat(702, "Therm2", 19.0, LocalDateTime.now().plusHours(5)));

        return devices;
    }
}
