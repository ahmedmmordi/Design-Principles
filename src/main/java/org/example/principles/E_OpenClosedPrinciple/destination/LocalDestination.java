package org.example.principles.E_OpenClosedPrinciple.destination;

public class LocalDestination implements DestinationType {
    @Override
    public String getDestinationTypeName() {
        return "Local";
    }

    @Override
    public double priceMultiplier() {
        return 1.5;
    }
}
