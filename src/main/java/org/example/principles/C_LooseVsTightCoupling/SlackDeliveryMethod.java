package org.example.principles.C_LooseVsTightCoupling;

public class SlackDeliveryMethod implements DeliveryMethod {
    @Override
    public String getDeliveryMethod() {
        return "Slack";
    }
}
