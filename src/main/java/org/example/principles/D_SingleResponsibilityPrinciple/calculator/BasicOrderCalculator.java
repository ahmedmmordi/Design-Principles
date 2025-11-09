package org.example.principles.D_SingleResponsibilityPrinciple.calculator;

import org.example.principles.D_SingleResponsibilityPrinciple.model.Item;
import org.example.principles.D_SingleResponsibilityPrinciple.model.Order;

public class BasicOrderCalculator implements PriceCalculator {
    @Override
    public double calculate(Order order) {
        double totalPrice = 0.0;
        for (Item item : order.getOrderItems()) {
            totalPrice += item.getItemPrice() * item.getItemQuantity();
        }
        return totalPrice;
    }

    @Override
    public double applyDiscount(Order order, double discount) {
        return calculate(order) * (1 - discount);
    }
}
