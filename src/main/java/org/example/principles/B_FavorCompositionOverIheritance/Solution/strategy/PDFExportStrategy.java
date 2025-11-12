package org.example.principles.B_FavorCompositionOverIheritance.Solution.strategy;

public class PDFExportStrategy implements ExportStrategy {
    @Override
    public void export(String data) {
        System.out.println("PDF " + data);
    }
}
