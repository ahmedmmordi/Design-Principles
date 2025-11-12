package org.example.principles.G_InterfaceSegregationPrinciple.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.environment.DurationControllable;

import java.util.List;

public interface SprinklerPrinter {
    void printAllSprinklerDuration(List<DurationControllable> sprinklers);
}
