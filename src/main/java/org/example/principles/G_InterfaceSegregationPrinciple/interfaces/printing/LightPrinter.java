package org.example.principles.G_InterfaceSegregationPrinciple.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.ColorAdjustable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.Dimmable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.lighting.LightAdjustable;

import java.util.List;

public interface LightPrinter {
    void printAllLightState(List<LightAdjustable> lights);
    void printAllLightColors(List<ColorAdjustable> colorLights);
    void printAllLightDimLevels(List<Dimmable> dimmableLights);
}
