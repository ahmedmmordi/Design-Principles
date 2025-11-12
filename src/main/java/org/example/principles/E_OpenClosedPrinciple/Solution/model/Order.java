package org.example.principles.E_OpenClosedPrinciple.Solution.model;

import org.example.principles.E_OpenClosedPrinciple.Solution.destination.DestinationType;
import org.example.principles.E_OpenClosedPrinciple.Solution.carrier.CarrierType;

public class Order {
    private int orderId;
    private double orderWeight;
    private double orderPrice;
    private CarrierType carrierType;
    private DestinationType destinationType;

    public Order(int orderId, double orderWeight, double orderPrice, CarrierType carrierType, DestinationType destinationType) {
        this.orderId = orderId;
        this.orderWeight = orderWeight;
        this.orderPrice = orderPrice;
        this.carrierType = carrierType;
        this.destinationType = destinationType;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(double orderWeight) {
        this.orderWeight = orderWeight;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getCarrierType() {
        return carrierType.getCarrierTypeName();
    }

    public void setCarrierType(CarrierType carrierType) {
        this.carrierType = carrierType;
    }

    public String getDestinationType() {
        return destinationType.getDestinationTypeName();
    }

    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderWeight=" + orderWeight +
                ", destinationType=" + destinationType +
                '}';
    }
}
