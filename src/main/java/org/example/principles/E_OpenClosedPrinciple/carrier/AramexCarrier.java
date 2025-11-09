package org.example.principles.E_OpenClosedPrinciple.carrier;

public class AramexCarrier implements CarrierType {
    private final double MULTIPLIER;
    public AramexCarrier(double MULTIPLIER) {
        this.MULTIPLIER = MULTIPLIER;
    }

    @Override
    public String getCarrierTypeName() {
        return "Aramex";
    }

    @Override
    public double getCarrierMultiplier() {
        return MULTIPLIER;
    }
}
