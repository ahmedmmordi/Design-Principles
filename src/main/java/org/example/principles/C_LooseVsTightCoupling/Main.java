package org.example.principles.C_LooseVsTightCoupling;

import org.example.principles.C_LooseVsTightCoupling.category.Inventory;
import org.example.principles.C_LooseVsTightCoupling.category.Performance;
import org.example.principles.C_LooseVsTightCoupling.category.Sales;
import org.example.principles.C_LooseVsTightCoupling.delivery.EmailDeliveryMethod;
import org.example.principles.C_LooseVsTightCoupling.delivery.PushDeliveryMethod;
import org.example.principles.C_LooseVsTightCoupling.delivery.SlackDeliveryMethod;
import org.example.principles.C_LooseVsTightCoupling.service.ReportService;

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
