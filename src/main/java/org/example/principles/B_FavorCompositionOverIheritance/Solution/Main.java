package org.example.principles.B_FavorCompositionOverIheritance.Solution;

import org.example.principles.B_FavorCompositionOverIheritance.Solution.generator.DocumentGenerator;
import org.example.principles.B_FavorCompositionOverIheritance.Solution.provider.APIDataProvider;
import org.example.principles.B_FavorCompositionOverIheritance.Solution.provider.DatabaseDataProvider;
import org.example.principles.B_FavorCompositionOverIheritance.Solution.provider.FileDataProvider;
import org.example.principles.B_FavorCompositionOverIheritance.Solution.strategy.HTMLExportStrategy;
import org.example.principles.B_FavorCompositionOverIheritance.Solution.strategy.PDFExportStrategy;
import org.example.principles.B_FavorCompositionOverIheritance.Solution.strategy.TextExportStrategy;

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
