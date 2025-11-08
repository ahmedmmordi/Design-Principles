package org.example.principles.B_FavorCompositionOverIheritance;

public class DatabaseDataProvider implements DataProvider {
    @Override
    public String getData() {
        return "Data from Database";
    }
}
