package org.example.principles.D_SingleResponsibilityPrinciple;

import org.example.principles.D_SingleResponsibilityPrinciple.calculator.BasicOrderCalculator;
import org.example.principles.D_SingleResponsibilityPrinciple.manager.OrderManager;
import org.example.principles.D_SingleResponsibilityPrinciple.model.Item;
import org.example.principles.D_SingleResponsibilityPrinciple.model.Order;
import org.example.principles.D_SingleResponsibilityPrinciple.notification.EmailNotificationService;
import org.example.principles.D_SingleResponsibilityPrinciple.persistence.DatabaseOrderPersistence;
import org.example.principles.D_SingleResponsibilityPrinciple.printer.CheckPrinter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Milk", 2, 7);
        Item item2 = new Item(2, "Bread", 3, 2);
        Item item3 = new Item(3, "Cheese", 1, 10);

        Order order = new Order(1, "Ahmed Mordi's Order", List.of(item1, item2, item3));

        OrderManager orderManager = new OrderManager(new EmailNotificationService(), new DatabaseOrderPersistence(), new BasicOrderCalculator(), new CheckPrinter());
        orderManager.createOrder(order);
        orderManager.saveOrder(order);
        orderManager.calculateTotal(order, false);
        orderManager.calculateTotal(order, true);
        orderManager.orderStatus(order);
        orderManager.cancelOrder(1);
    }
}
