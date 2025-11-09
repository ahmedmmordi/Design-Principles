package org.example.principles.E_OpenClosedPrinciple.calculator;

public class EconomyShipping implements ShippingCalculator {
    @Override
    public double calculate(double price, double weight, double multiplier) {
        return price + weight * multiplier;
    }
}
