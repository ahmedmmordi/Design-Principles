package org.example.principles.E_OpenClosedPrinciple.Solution.printer;

import org.example.principles.E_OpenClosedPrinciple.Solution.model.Order;
import org.example.principles.E_OpenClosedPrinciple.Solution.service.DestinationService;

public interface OrderPrinter {
    public void print(Order order, DestinationService destinationService);
}
