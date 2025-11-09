package org.example.principles.C_LooseVsTightCoupling.delivery;

public class EmailDeliveryMethod implements DeliveryMethod {
    @Override
    public String getDeliveryMethod() {
        return "Email";
    }
}
