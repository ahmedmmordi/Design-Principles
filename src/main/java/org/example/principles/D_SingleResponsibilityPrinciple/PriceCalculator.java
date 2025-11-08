package org.example.principles.D_SingleResponsibilityPrinciple;

public interface PriceCalculator {
    public double calculate(Order order);
    public double applyDiscount(Order order, double discount);
}
