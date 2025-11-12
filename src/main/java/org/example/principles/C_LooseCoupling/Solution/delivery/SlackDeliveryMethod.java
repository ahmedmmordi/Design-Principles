package org.example.principles.C_LooseCoupling.Solution.delivery;

public class SlackDeliveryMethod implements DeliveryMethod {
    @Override
    public String getDeliveryMethod() {
        return "Slack";
    }
}
