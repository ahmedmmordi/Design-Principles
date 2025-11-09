package org.example.principles.E_OpenClosedPrinciple.service;

import org.example.principles.E_OpenClosedPrinciple.calculator.ShippingCalculator;
import org.example.principles.E_OpenClosedPrinciple.carrier.CarrierType;
import org.example.principles.E_OpenClosedPrinciple.model.Order;

public class CarrierService {
    private final CarrierType carrierType;
    private final ShippingCalculator shippingCalculator;
    private final Order order;
    private double carrierCost;

    public CarrierService(CarrierType carrierType, ShippingCalculator shippingCalculator, Order order, double carrierCost) {
        this.carrierType = carrierType;
        this.shippingCalculator = shippingCalculator;
        this.order = order;
        this.carrierCost = carrierCost;
    }

    public CarrierService(CarrierType carrierType, ShippingCalculator shippingCalculator, Order order) {
        this(carrierType, shippingCalculator, order, 0);
    }

    public double calculateCarrierCost(double orderPrice, double orderWeight) {
        carrierCost = shippingCalculator.calculate(order.getOrderPrice(), order.getOrderWeight(), carrierType.getCarrierMultiplier());
        return carrierCost;
    }

    public double getCarrierCost() {
        return carrierCost;
    }
}
