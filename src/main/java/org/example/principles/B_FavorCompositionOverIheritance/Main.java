package org.example.principles.B_FavorCompositionOverIheritance;

public class Main {
    public static void main(String[] args) {
        DocumentGenerator documentGenerator = new DocumentGenerator(new TextExportStrategy(), new DatabaseDataProvider());
        documentGenerator.generateDocument();

        documentGenerator.setExportStrategy(new HTMLExportStrategy());
        documentGenerator.setDataSource(new APIDataProvider());
        documentGenerator.generateDocument();

        documentGenerator.setExportStrategy(new PDFExportStrategy());
        documentGenerator.setDataSource(new FileDataProvider());
        documentGenerator.generateDocument();
    }
}
