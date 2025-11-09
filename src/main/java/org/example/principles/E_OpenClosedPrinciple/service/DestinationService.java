package org.example.principles.E_OpenClosedPrinciple.service;

import org.example.principles.E_OpenClosedPrinciple.destination.DestinationType;

public class DestinationService {
    private final DestinationType destinationType;
    private final CarrierService carrierService;
    public DestinationService(DestinationType destinationType, CarrierService carrierService) {
        this.destinationType = destinationType;
        this.carrierService = carrierService;
    }

    public double calculateFinalCost() {
        return carrierService.getCarrierCost() * destinationType.priceMultiplier();
    }
}
