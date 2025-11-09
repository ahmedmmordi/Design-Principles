package org.example.principles.D_SingleResponsibilityPrinciple.calculator;

import org.example.principles.D_SingleResponsibilityPrinciple.model.Order;

public interface PriceCalculator {
    public double calculate(Order order);
    public double applyDiscount(Order order, double discount);
}
