package org.example.principles.B_FavorCompositionOverIheritance;

public class TextExportStrategy implements ExportStrategy {
    @Override
    public void export(String data) {
        System.out.println("Text " + data);
    }
}
