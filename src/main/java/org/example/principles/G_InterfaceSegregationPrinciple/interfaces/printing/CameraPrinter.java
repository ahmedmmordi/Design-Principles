package org.example.principles.G_InterfaceSegregationPrinciple.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.recording.VideoRecordable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.security.MotionDetectable;

import java.util.List;

public interface CameraPrinter {
    void printAllCameraState(List<VideoRecordable> cameras);
    void printAllMotionDetectionLogs(List<MotionDetectable> cameras);
}
