package org.example.principles.C_LooseVsTightCoupling;

public class Main {
    public static void main(String[] args) {
        ReportService reportService = new ReportService(new EmailDeliveryMethod(), new Sales());
        reportService.generateReport();

        reportService.setDeliveryMethod(new SlackDeliveryMethod());
        reportService.setReportCategory(new Sales());
        reportService.generateReport();

        reportService.setDeliveryMethod(new PushDeliveryMethod());
        reportService.setReportCategory(new Inventory());
        reportService.generateReport();

        reportService.setDeliveryMethod(new EmailDeliveryMethod());
        reportService.setReportCategory(new Performance());
        reportService.generateReport();
    }
}
