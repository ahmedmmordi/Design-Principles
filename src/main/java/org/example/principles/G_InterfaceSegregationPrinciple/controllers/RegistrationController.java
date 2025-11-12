package org.example.principles.G_InterfaceSegregationPrinciple.controllers;

import org.example.principles.G_InterfaceSegregationPrinciple.devices.SmartDevice;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.environment.DurationControllable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.environment.TemperatureControllable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.environment.WateringControllable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.ColorAdjustable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.Dimmable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.LightAdjustable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.recording.VideoRecordable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.scheduling.Schedulable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.security.Lockable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.security.MotionDetectable;

import java.util.ArrayList;
import java.util.List;

public class RegistrationController {
    private final List<SmartDevice> allDevices = new ArrayList<>();
    private final List<LightAdjustable> lights = new ArrayList<>();
    private final List<ColorAdjustable> colorLights = new ArrayList<>();
    private final List<Dimmable> dimmableLights = new ArrayList<>();
    private final List<WateringControllable> sprinklers = new ArrayList<>();
    private final List<DurationControllable> durations = new ArrayList<>();
    private final List<Lockable> locks = new ArrayList<>();
    private final List<VideoRecordable> cameras = new ArrayList<>();
    private final List<MotionDetectable> motionCameras = new ArrayList<>();
    private final List<TemperatureControllable> thermostats = new ArrayList<>();
    private final List<Schedulable> schedulables = new ArrayList<>();

    public void registerGeneralDevice(SmartDevice device) {
        allDevices.add(device);
    }

    public void registerLight(LightAdjustable light) {
        lights.add(light);
    }

    public void registerColorLight(ColorAdjustable colorLight) {
        colorLights.add(colorLight);
    }

    public void registerDimmable(Dimmable dimmable) {
        dimmableLights.add(dimmable);
    }

    public void registerSprinkler(WateringControllable sprinkler) {
        sprinklers.add(sprinkler);
    }

    public void registerDuration(DurationControllable duration) {
        durations.add(duration);
    }

    public void registerLock(Lockable lock) {
        locks.add(lock);
    }

    public void registerCamera(VideoRecordable camera) {
        cameras.add(camera);
    }

    public void registerMotion(MotionDetectable motion) {
        motionCameras.add(motion);
    }

    public void registerThermostat(TemperatureControllable thermostat) {
        thermostats.add(thermostat);
    }

    public void registerSchedulable(Schedulable schedulable) {
        schedulables.add(schedulable);
    }

    public List<SmartDevice> getAllDevices() {
        return allDevices;
    }

    public List<LightAdjustable> getLights() {
        return lights;
    }

    public List<ColorAdjustable> getColorLights() {
        return colorLights;
    }

    public List<Dimmable> getDimmableLights() {
        return dimmableLights;
    }

    public List<ColorAdjustable> getSmartLights() {
        return colorLights;
    }

    public List<WateringControllable> getSprinklers() {
        return sprinklers;
    }

    public List<DurationControllable> getDurations() {
        return durations;
    }

    public List<Lockable> getLocks() {
        return locks;
    }

    public List<VideoRecordable> getCameras() {
        return cameras;
    }

    public List<MotionDetectable> getMotionCameras() {
        return motionCameras;
    }

    public List<TemperatureControllable> getThermostats() {
        return thermostats;
    }

    public List<Schedulable> getSchedulables() {
        return schedulables;
    }
}
