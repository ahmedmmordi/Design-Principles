package org.example.principles.C_LooseVsTightCoupling;

public class Sales implements ReportCategory {
    @Override
    public String getReportCategory() {
        return "Sales";
    }
}
