package org.example.principles.E_OpenClosedPrinciple.printer;

import org.example.principles.E_OpenClosedPrinciple.model.Order;
import org.example.principles.E_OpenClosedPrinciple.service.DestinationService;

public class BasicOrderPrinter implements OrderPrinter {
    @Override
    public void print(Order order, DestinationService destinationService) {
        System.out.println("Shipping cost for " + order.getCarrierType() +
                "(" + order.getOrderWeight() +
                "KG, " + order.getDestinationType() +
                ") is: $" + destinationService.calculateFinalCost() +
                "\n");
    }
}
