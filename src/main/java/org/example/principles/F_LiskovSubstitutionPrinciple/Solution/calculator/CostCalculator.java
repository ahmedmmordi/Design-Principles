package org.example.principles.F_LiskovSubstitutionPrinciple.Solution.calculator;

import org.example.principles.F_LiskovSubstitutionPrinciple.Solution.vehicle.Vehicle;

public interface CostCalculator {
    double calculate(Vehicle vehicle, double hours);
}
