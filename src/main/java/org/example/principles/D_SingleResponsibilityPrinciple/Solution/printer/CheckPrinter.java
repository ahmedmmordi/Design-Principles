package org.example.principles.D_SingleResponsibilityPrinciple.Solution.printer;

import org.example.principles.D_SingleResponsibilityPrinciple.Solution.model.Item;
import org.example.principles.D_SingleResponsibilityPrinciple.Solution.model.Order;

public class CheckPrinter implements OrderPrinter {
    @Override
    public void print(Order order) {
        System.out.println(" - " + order.getOrderName());
        for(Item item : order.getOrderItems()) {
            System.out.println("   - " + item.getItemQuantity() + " * " + item.getItemName() + " = " +  item.getItemPrice() *  item.getItemQuantity());
        }
        System.out.println("--------------------------\n");
    }
}
