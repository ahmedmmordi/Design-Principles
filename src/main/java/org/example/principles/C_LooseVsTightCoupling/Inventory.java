package org.example.principles.C_LooseVsTightCoupling;

public class Inventory implements ReportCategory {
    @Override
    public String getReportCategory() {
        return "Inventory";
    }
}
