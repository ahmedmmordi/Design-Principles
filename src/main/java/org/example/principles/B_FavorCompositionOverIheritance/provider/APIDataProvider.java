package org.example.principles.B_FavorCompositionOverIheritance.provider;

public class APIDataProvider implements DataProvider {
    @Override
    public String getData() {
        return "Data from API";
    }
}
