package org.example.principles.E_OpenClosedPrinciple;

import org.example.principles.E_OpenClosedPrinciple.calculator.EconomyShipping;
import org.example.principles.E_OpenClosedPrinciple.carrier.CarrierType;
import org.example.principles.E_OpenClosedPrinciple.carrier.DHLCarrier;
import org.example.principles.E_OpenClosedPrinciple.carrier.FedExCarrier;
import org.example.principles.E_OpenClosedPrinciple.destination.DestinationType;
import org.example.principles.E_OpenClosedPrinciple.destination.InternationalDestination;
import org.example.principles.E_OpenClosedPrinciple.destination.LocalDestination;
import org.example.principles.E_OpenClosedPrinciple.model.Order;
import org.example.principles.E_OpenClosedPrinciple.printer.BasicOrderPrinter;
import org.example.principles.E_OpenClosedPrinciple.service.CarrierService;
import org.example.principles.E_OpenClosedPrinciple.service.DestinationService;
import org.example.principles.E_OpenClosedPrinciple.service.OrderManager;

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
