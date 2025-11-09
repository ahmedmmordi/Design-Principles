package org.example.principles.E_OpenClosedPrinciple.carrier;

public class FedExCarrier implements CarrierType {
    private final double MULTIPLIER;
    public FedExCarrier(double MULTIPLIER) {
        this.MULTIPLIER = MULTIPLIER;
    }

    @Override
    public String getCarrierTypeName() {
        return "FedEx";
    }

    @Override
    public double getCarrierMultiplier() {
        return MULTIPLIER;
    }
}
