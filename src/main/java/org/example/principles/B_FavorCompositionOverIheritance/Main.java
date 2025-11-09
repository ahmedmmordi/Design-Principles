package org.example.principles.B_FavorCompositionOverIheritance;

import org.example.principles.B_FavorCompositionOverIheritance.generator.DocumentGenerator;
import org.example.principles.B_FavorCompositionOverIheritance.provider.APIDataProvider;
import org.example.principles.B_FavorCompositionOverIheritance.provider.DatabaseDataProvider;
import org.example.principles.B_FavorCompositionOverIheritance.provider.FileDataProvider;
import org.example.principles.B_FavorCompositionOverIheritance.strategy.HTMLExportStrategy;
import org.example.principles.B_FavorCompositionOverIheritance.strategy.PDFExportStrategy;
import org.example.principles.B_FavorCompositionOverIheritance.strategy.TextExportStrategy;

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
