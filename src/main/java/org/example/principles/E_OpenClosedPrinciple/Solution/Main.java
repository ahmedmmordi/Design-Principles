package org.example.principles.E_OpenClosedPrinciple.Solution;

import org.example.principles.E_OpenClosedPrinciple.Solution.calculator.EconomyShipping;
import org.example.principles.E_OpenClosedPrinciple.Solution.carrier.CarrierType;
import org.example.principles.E_OpenClosedPrinciple.Solution.carrier.DHLCarrier;
import org.example.principles.E_OpenClosedPrinciple.Solution.carrier.FedExCarrier;
import org.example.principles.E_OpenClosedPrinciple.Solution.destination.DestinationType;
import org.example.principles.E_OpenClosedPrinciple.Solution.destination.InternationalDestination;
import org.example.principles.E_OpenClosedPrinciple.Solution.destination.LocalDestination;
import org.example.principles.E_OpenClosedPrinciple.Solution.model.Order;
import org.example.principles.E_OpenClosedPrinciple.Solution.printer.BasicOrderPrinter;
import org.example.principles.E_OpenClosedPrinciple.Solution.service.CarrierService;
import org.example.principles.E_OpenClosedPrinciple.Solution.service.DestinationService;
import org.example.principles.E_OpenClosedPrinciple.Solution.service.OrderManager;

public class Main {
    public static void main(String[] args) {
        CarrierType carrierType = new DHLCarrier(1.5);
        DestinationType destinationType = new LocalDestination();
        Order order = new Order(1, 2.5, 15, carrierType, destinationType);

        OrderManager orderManager = null;
        OrderManagerNewRequest(orderManager, order, carrierType, destinationType);

        carrierType = new FedExCarrier(1.2);
        destinationType = new InternationalDestination();
        order.setDestinationType(destinationType);
        order = new Order(2, 3.1, 19, carrierType, destinationType);
        OrderManagerNewRequest(orderManager, order, carrierType, destinationType);
    }

    private static OrderManager getOrderManager(Order order, CarrierType carrierType, DestinationType destinationType) {
        CarrierService carrierService = new CarrierService(carrierType, new EconomyShipping(), order);

        return new OrderManager(
                new BasicOrderPrinter(),
                carrierService,
                new DestinationService(destinationType, carrierService)
        );
    }

    private static void OrderManagerNewRequest(OrderManager orderManager, Order order, CarrierType carrierType, DestinationType destinationType) {
        orderManager = getOrderManager(order, carrierType, destinationType);
        orderManager.createOrder(order);
        orderManager.printOrder(order);
        orderManager.cancelOrder(order);
        System.out.println("--------------------------------------------");
    }
}
