package org.example.principles.E_OpenClosedPrinciple.Solution.calculator;

public interface ShippingCalculator {
    public double calculate(double orderPrice, double orderWeight, double multiplier);
}
