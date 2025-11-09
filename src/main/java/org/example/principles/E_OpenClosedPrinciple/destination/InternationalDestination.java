package org.example.principles.E_OpenClosedPrinciple.destination;

public class InternationalDestination implements DestinationType {
    @Override
    public String getDestinationTypeName() {
        return "International";
    }

    @Override
    public double priceMultiplier() {
        return 4;
    }
}
