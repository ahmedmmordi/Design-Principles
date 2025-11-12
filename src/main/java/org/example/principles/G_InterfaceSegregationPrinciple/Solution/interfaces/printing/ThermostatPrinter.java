package org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.environment.TemperatureControllable;
import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.scheduling.Schedulable;

import java.util.List;

public interface ThermostatPrinter {
    void printAllThermostatTemperature(List<TemperatureControllable> thermostats);
    void printAllThermostatTime(List<Schedulable> schedulables);
}
