package org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.recording.VideoRecordable;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.security.MotionDetectable;

import java.util.List;

public interface CameraPrinter {
    void printAllCameraState(List<VideoRecordable> cameras);
    void printAllMotionDetectionLogs(List<MotionDetectable> cameras);
}
