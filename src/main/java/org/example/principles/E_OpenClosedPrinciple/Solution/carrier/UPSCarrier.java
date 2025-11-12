package org.example.principles.E_OpenClosedPrinciple.Solution.carrier;

public class UPSCarrier implements CarrierType {
    private final double MULTIPLIER;
    public UPSCarrier(double MULTIPLIER) {
        this.MULTIPLIER = MULTIPLIER;
    }

    @Override
    public String getCarrierTypeName() {
        return "UPS";
    }

    @Override
    public double getCarrierMultiplier() {
        return MULTIPLIER;
    }
}
