package org.example.principles.D_SingleResponsibilityPrinciple.manager;

import org.example.principles.D_SingleResponsibilityPrinciple.notification.NotificationService;
import org.example.principles.D_SingleResponsibilityPrinciple.persistence.OrderPersistence;
import org.example.principles.D_SingleResponsibilityPrinciple.printer.OrderPrinter;
import org.example.principles.D_SingleResponsibilityPrinciple.calculator.PriceCalculator;
import org.example.principles.D_SingleResponsibilityPrinciple.model.Order;

public class OrderManager {
    private final NotificationService notificationService;
    private final OrderPersistence orderPersistence;
    private final PriceCalculator priceCalculator;
    private final OrderPrinter orderPrinter;
    public OrderManager(NotificationService notificationService, OrderPersistence orderPersistence, PriceCalculator priceCalculator, OrderPrinter orderPrinter) {
        this.notificationService = notificationService;
        this.orderPersistence = orderPersistence;
        this.priceCalculator = priceCalculator;
        this.orderPrinter = orderPrinter;
    }

    public void createOrder(Order order) {
        System.out.println("Order number " + order.getOrderId() + " created successfully. Full Order Details: ");
        orderPrinter.print(order);
    }

    public void cancelOrder(int orderId) {
        System.out.println("Order number " + orderId + " cancelled successfully.\n");
    }

    public void calculateTotal(Order order, boolean discount) {
        System.out.println("Total is: " + (discount ? priceCalculator.applyDiscount(order, 0.10) : priceCalculator.calculate(order)) + "\n");
    }

    public void saveOrder(Order order) {
        System.out.println("Order number " + order.getOrderId() + " saved to: " + orderPersistence.persist() + "\n");
    }

    public void orderStatus(Order order) {
        notificationService.notify("Your order number " + order.getOrderId() + " is out for delivery.\n");
    }
}
