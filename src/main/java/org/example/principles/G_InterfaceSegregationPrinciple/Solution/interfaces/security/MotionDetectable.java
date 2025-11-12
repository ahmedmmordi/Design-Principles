package org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.security;

public interface MotionDetectable {
    void detectMotion();
    boolean isDetectingMotion();
    int getNumberOfDetectedObjects();
}
