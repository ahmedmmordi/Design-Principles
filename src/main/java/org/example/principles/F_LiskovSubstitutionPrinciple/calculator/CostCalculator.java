package org.example.principles.F_LiskovSubstitutionPrinciple.calculator;

import org.example.principles.F_LiskovSubstitutionPrinciple.vehicle.Vehicle;

public interface CostCalculator {
    double calculate(Vehicle vehicle, double hours);
}
