package org.example.principles.E_OpenClosedPrinciple.service;

import org.example.principles.E_OpenClosedPrinciple.printer.OrderPrinter;
import org.example.principles.E_OpenClosedPrinciple.model.Order;

public class OrderManager {
    private final OrderPrinter orderPrinter;
    private final CarrierService carrierService;
    private final DestinationService destinationService;

    public OrderManager(OrderPrinter orderPrinter, CarrierService carrierService, DestinationService destinationService) {
        this.orderPrinter = orderPrinter;
        this.carrierService = carrierService;
        this.destinationService = destinationService;
    }

    public void createOrder(Order order) {
        carrierService.calculateCarrierCost(order.getOrderPrice(), order.getOrderWeight());
        System.out.println("Order with ID " + order.getOrderId() + " Created successfully.\n");
    }

    public void cancelOrder(Order order) {
        System.out.println("Order with ID " + order.getOrderId() + " Cancelled successfully.");
    }

    public void printOrder(Order order) {
        System.out.println("Order Details:");
        orderPrinter.print(order, destinationService);
    }
}
