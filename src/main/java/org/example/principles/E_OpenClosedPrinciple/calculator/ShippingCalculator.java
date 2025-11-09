package org.example.principles.E_OpenClosedPrinciple.calculator;

public interface ShippingCalculator {
    public double calculate(double orderPrice, double orderWeight, double multiplier);
}
