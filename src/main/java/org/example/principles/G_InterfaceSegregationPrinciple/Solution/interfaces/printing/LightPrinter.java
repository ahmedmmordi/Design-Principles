package org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.lighting.ColorAdjustable;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.lighting.Dimmable;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.lighting.LightAdjustable;

import java.util.List;

public interface LightPrinter {
    void printAllLightState(List<LightAdjustable> lights);
    void printAllLightColors(List<ColorAdjustable> colorLights);
    void printAllLightDimLevels(List<Dimmable> dimmableLights);
}
