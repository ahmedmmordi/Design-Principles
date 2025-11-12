package org.example.principles.D_SingleResponsibilityPrinciple.Solution.calculator;

import org.example.principles.D_SingleResponsibilityPrinciple.Solution.model.Order;

public interface PriceCalculator {
    public double calculate(Order order);
    public double applyDiscount(Order order, double discount);
}
