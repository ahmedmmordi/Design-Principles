package org.example.principles.G_InterfaceSegregationPrinciple.printers;

import org.example.principles.G_InterfaceSegregationPrinciple.devices.SmartDevice;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.environment.DurationControllable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.environment.TemperatureControllable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.ColorAdjustable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.Dimmable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.LightAdjustable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.printing.FullPrinter;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.recording.VideoRecordable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.scheduling.Schedulable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.security.Lockable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.security.MotionDetectable;

import java.lang.reflect.Method;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ConsoleFullPrinter implements FullPrinter {
    @Override
    public void printAllDeviceNameAndId(List<SmartDevice> devices) {
        System.out.println("Devices Names and IDs:");
        for (SmartDevice device : devices) {
            System.out.println("  - Name: " + device.getDeviceName() + ", ID: " + device.getDeviceId());
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void printAllMethodsOfADevice(SmartDevice device) {
        System.out.println("Methods for device: " + device.getDeviceName() + " (" + device.getClass().getSimpleName() + ")");
        for (Method method : device.getClass().getMethods()) {
            if (method.getDeclaringClass() != Object.class) {
                System.out.println("  - " + method.getName() + "()");
            }
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void printAllLightState(List<LightAdjustable> lights) {
        System.out.println("Lights State:");
        for (LightAdjustable light : lights) {
            SmartDevice device = (SmartDevice) light;
            System.out.println("  - " + device.getDeviceName() + ": " + (light.isLightOn() ? "On" : "Off"));
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void printAllLightColors(List<ColorAdjustable> colorLights) {
        System.out.println("Lights Colors:");
        for (ColorAdjustable light : colorLights) {
            SmartDevice device = (SmartDevice) light;
            System.out.println("  - " + device.getDeviceName() + ": " + light.getSmartLightColor());
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void printAllLightDimLevels(List<Dimmable> dimmableLights) {
        System.out.println("Lights Dim Levels:");
        for (Dimmable dim : dimmableLights) {
            SmartDevice device = (SmartDevice) dim;
            System.out.println("  - " + device.getDeviceName() + ": " + dim.getSmartLightDimLevel());
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void printAllSprinklerDuration(List<DurationControllable> sprinklers) {
        System.out.println("Sprinklers Duration:");
        for (DurationControllable sprinkler : sprinklers) {
            SmartDevice device = (SmartDevice) sprinkler;
            System.out.println("  - " + device.getDeviceName() + ": " + String.format("%.2f", sprinkler.getDuration()) + " min");
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void printAllThermostatTemperature(List<TemperatureControllable> thermostats) {
        System.out.println("Thermostats Temperature:");
        for (TemperatureControllable t : thermostats) {
            SmartDevice device = (SmartDevice) t;
            System.out.println("  - " + device.getDeviceName() + ": " + String.format("%.2f", t.getTemperature()) + " °C");
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void printAllThermostatTime(List<Schedulable> schedulables) {
        System.out.println("Thermostats Scheduled Time:");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (Schedulable s : schedulables) {
            SmartDevice device = (SmartDevice) s;
            System.out.println("  - " + device.getDeviceName() + ": " + s.getTime().format(formatter));
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void printAllLockStates(List<Lockable> locks) {
        System.out.println("Locks State:");
        for (Lockable lock : locks) {
            SmartDevice device = (SmartDevice) lock;
            System.out.println("  - " + device.getDeviceName() + ": " + (lock.isLocked() ? "Locked" : "Unlocked"));
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void printAllCameraState(List<VideoRecordable> cameras) {
        System.out.println("Cameras Recording State:");
        for (VideoRecordable camera : cameras) {
            SmartDevice device = (SmartDevice) camera;
            System.out.println("  - " + device.getDeviceName() + ": " + (camera.isRecording() ? "Recording" : "Not Recording"));
        }
        System.out.println("------------------------------------");
    }

    @Override
    public void printAllMotionDetectionLogs(List<MotionDetectable> cameras) {
        System.out.println("Motion Detection Logs:");
        for (MotionDetectable cam : cameras) {
            SmartDevice device = (SmartDevice) cam;
            System.out.println("  - " + device.getDeviceName() + ": Detected Objects = " + cam.getNumberOfDetectedObjects());
        }
        System.out.println("------------------------------------");
    }
}
