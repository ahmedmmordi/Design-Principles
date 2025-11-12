package org.example.principles.C_LooseCoupling.Solution;

import org.example.principles.C_LooseCoupling.Solution.category.Inventory;
import org.example.principles.C_LooseCoupling.Solution.category.Performance;
import org.example.principles.C_LooseCoupling.Solution.category.Sales;
import org.example.principles.C_LooseCoupling.Solution.delivery.EmailDeliveryMethod;
import org.example.principles.C_LooseCoupling.Solution.delivery.PushDeliveryMethod;
import org.example.principles.C_LooseCoupling.Solution.delivery.SlackDeliveryMethod;
import org.example.principles.C_LooseCoupling.Solution.service.ReportService;

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
