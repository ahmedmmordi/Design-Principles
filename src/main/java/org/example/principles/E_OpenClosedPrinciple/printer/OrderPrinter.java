package org.example.principles.E_OpenClosedPrinciple.printer;

import org.example.principles.E_OpenClosedPrinciple.model.Order;
import org.example.principles.E_OpenClosedPrinciple.service.DestinationService;

public interface OrderPrinter {
    public void print(Order order, DestinationService destinationService);
}
