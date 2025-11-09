package org.example.principles.D_SingleResponsibilityPrinciple.model;

import java.util.List;

public class Order {
    private int orderId;
    private String orderName;
    private List<Item> orderItems;

    public Order(int orderId, String orderName, List<Item> orderItems) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderItems = orderItems;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public List<Item> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<Item> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", orderItems=" + orderItems +
                '}';
    }
}
