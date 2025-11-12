package org.example.principles.G_InterfaceSegregationPrinciple.Solution.devices;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.controllers.RegistrationController;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.recording.VideoRecordable;

public class BasicCamera extends SmartDevice implements VideoRecordable {
    private boolean basicCameraRecordingState;

    public BasicCamera(int basicCameraId, String basicCameraName, boolean basicCameraRecordingState) {
        super(basicCameraId, basicCameraName);
        this.basicCameraRecordingState = basicCameraRecordingState;
    }

    @Override
    public void registerCapabilities(RegistrationController registry) {
        registry.registerGeneralDevice(this);
        registry.registerCamera(this);
        System.out.println("Registered device: " + getDeviceName() + " (ID: " + getDeviceId() + ")");
    }

    @Override
    public void startRecord() {
        this.basicCameraRecordingState = true;
    }

    @Override
    public void stopRecord() {
        this.basicCameraRecordingState = false;
    }

    @Override
    public boolean isRecording() {
        return this.basicCameraRecordingState;
    }
}
