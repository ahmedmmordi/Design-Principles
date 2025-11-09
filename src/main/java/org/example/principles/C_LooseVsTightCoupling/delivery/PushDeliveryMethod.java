package org.example.principles.C_LooseVsTightCoupling.delivery;

public class PushDeliveryMethod implements DeliveryMethod {
    @Override
    public String getDeliveryMethod() {
        return "Push";
    }
}
