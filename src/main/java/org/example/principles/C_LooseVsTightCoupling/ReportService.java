package org.example.principles.C_LooseVsTightCoupling;

public class ReportService {
    private DeliveryMethod deliveryMethod;
    private ReportCategory reportCategory;
    public ReportService(DeliveryMethod deliveryMethod, ReportCategory reportCategory) {
        this.deliveryMethod = deliveryMethod;
        this.reportCategory = reportCategory;
    }

    public void generateReport() {
        System.out.println(deliveryMethod.getDeliveryMethod() + " delivery: Monthly " +  reportCategory.getReportCategory() + " Report.");
    }

    public DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public ReportCategory getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(ReportCategory reportCategory) {
        this.reportCategory = reportCategory;
    }
}
