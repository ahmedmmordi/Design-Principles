package org.example.principles.B_FavorCompositionOverIheritance.provider;

public class DatabaseDataProvider implements DataProvider {
    @Override
    public String getData() {
        return "Data from Database";
    }
}
