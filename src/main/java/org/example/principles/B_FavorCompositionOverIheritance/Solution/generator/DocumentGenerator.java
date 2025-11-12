package org.example.principles.B_FavorCompositionOverIheritance.Solution.generator;

import org.example.principles.B_FavorCompositionOverIheritance.Solution.provider.DataProvider;
import org.example.principles.B_FavorCompositionOverIheritance.Solution.strategy.ExportStrategy;

public class DocumentGenerator {
    private ExportStrategy exportStrategy;
    private DataProvider dataProvider;
    public DocumentGenerator(ExportStrategy exportStrategy, DataProvider dataProvider) {
        this.exportStrategy = exportStrategy;
        this.dataProvider = dataProvider;
    }

    public void generateDocument() {
        exportStrategy.export(dataProvider.getData());
    }

    public ExportStrategy getExportStrategy() {
        return exportStrategy;
    }

    public void setExportStrategy(ExportStrategy exportStrategy) {
        this.exportStrategy = exportStrategy;
    }

    public DataProvider getDataSource() {
        return dataProvider;
    }

    public void setDataSource(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }
}
