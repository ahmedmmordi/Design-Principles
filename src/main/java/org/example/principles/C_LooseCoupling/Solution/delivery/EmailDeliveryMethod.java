package org.example.principles.C_LooseCoupling.Solution.delivery;

public class EmailDeliveryMethod implements DeliveryMethod {
    @Override
    public String getDeliveryMethod() {
        return "Email";
    }
}
