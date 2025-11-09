package org.example.principles.C_LooseVsTightCoupling.delivery;

public class SlackDeliveryMethod implements DeliveryMethod {
    @Override
    public String getDeliveryMethod() {
        return "Slack";
    }
}
