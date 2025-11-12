package org.example.principles.G_InterfaceSegregationPrinciple.interfaces.security;

public interface MotionDetectable {
    void detectMotion();
    boolean isDetectingMotion();
    int getNumberOfDetectedObjects();
}
