package org.example.principles.B_FavorCompositionOverIheritance.provider;

public class FileDataProvider implements DataProvider {
    @Override
    public String getData() {
        return "Data from File";
    }
}
