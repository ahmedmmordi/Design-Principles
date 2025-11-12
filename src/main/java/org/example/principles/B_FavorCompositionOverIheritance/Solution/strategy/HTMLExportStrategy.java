package org.example.principles.B_FavorCompositionOverIheritance.Solution.strategy;

public class HTMLExportStrategy implements ExportStrategy {
    @Override
    public void export(String data) {
        System.out.println("HTML " + data);
    }
}
