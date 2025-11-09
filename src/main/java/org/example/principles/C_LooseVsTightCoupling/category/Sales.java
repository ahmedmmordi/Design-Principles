package org.example.principles.C_LooseVsTightCoupling.category;

public class Sales implements ReportCategory {
    @Override
    public String getReportCategory() {
        return "Sales";
    }
}
