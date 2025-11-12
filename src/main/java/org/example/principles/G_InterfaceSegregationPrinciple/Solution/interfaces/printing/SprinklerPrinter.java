package org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.environment.DurationControllable;

import java.util.List;

public interface SprinklerPrinter {
    void printAllSprinklerDuration(List<DurationControllable> sprinklers);
}
