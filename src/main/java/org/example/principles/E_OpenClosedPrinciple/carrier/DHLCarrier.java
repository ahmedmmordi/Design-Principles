package org.example.principles.E_OpenClosedPrinciple.carrier;

public class DHLCarrier implements CarrierType {
    private final double MULTIPLIER;
    public DHLCarrier(double MULTIPLIER) {
        this.MULTIPLIER = MULTIPLIER;
    }

    @Override
    public String getCarrierTypeName() {
        return "DHL";
    }

    @Override
    public double getCarrierMultiplier() {
        return MULTIPLIER;
    }
}
