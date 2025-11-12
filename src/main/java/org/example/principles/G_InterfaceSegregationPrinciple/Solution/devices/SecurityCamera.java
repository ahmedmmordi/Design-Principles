package org.example.principles.G_InterfaceSegregationPrinciple.Solution.devices;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.controllers.RegistrationController;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.security.MotionDetectable;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.recording.VideoRecordable;

public class SecurityCamera extends SmartDevice implements VideoRecordable, MotionDetectable {
    private boolean securityCameraRecordingState;
    private boolean securityCameraMotionDetectingState;
    private int numberOfDetectedObjects;

    public SecurityCamera(int securityCameraId, String securityCameraName, boolean securityCameraRecordingState, boolean securityCameraMotionDetectingState, int numberOfDetectedObjects) {
        super(securityCameraId, securityCameraName);
        this.securityCameraRecordingState = securityCameraRecordingState;
        this.securityCameraMotionDetectingState = securityCameraMotionDetectingState;
        this.numberOfDetectedObjects = numberOfDetectedObjects;
    }

    @Override
    public void registerCapabilities(RegistrationController registry) {
        registry.registerGeneralDevice(this);
        registry.registerCamera(this);
        registry.registerMotion(this);
        System.out.println("Registered device: " + getDeviceName() + " (ID: " + getDeviceId() + ")");
    }

    @Override
    public void startRecord() {
        this.securityCameraRecordingState = true;
    }

    @Override
    public void stopRecord() {
        this.securityCameraRecordingState = false;
    }

    @Override
    public boolean isRecording() {
        return this.securityCameraRecordingState;
    }

    @Override
    public void detectMotion() {
        this.securityCameraMotionDetectingState = true;
        ++numberOfDetectedObjects;
    }

    @Override
    public boolean isDetectingMotion() {
        return securityCameraMotionDetectingState;
    }

    @Override
    public int getNumberOfDetectedObjects() {
        return numberOfDetectedObjects;
    }
}
