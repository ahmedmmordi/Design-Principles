package org.example.principles.G_InterfaceSegregationPrinciple.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.environment.TemperatureControllable;
import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.scheduling.Schedulable;

import java.util.List;

public interface ThermostatPrinter {
    void printAllThermostatTemperature(List<TemperatureControllable> thermostats);
    void printAllThermostatTime(List<Schedulable> schedulables);
}
