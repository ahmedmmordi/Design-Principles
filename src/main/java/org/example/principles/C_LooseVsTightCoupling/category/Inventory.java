package org.example.principles.C_LooseVsTightCoupling.category;

public class Inventory implements ReportCategory {
    @Override
    public String getReportCategory() {
        return "Inventory";
    }
}
