package org.example.principles.B_FavorCompositionOverIheritance.Solution.provider;

public class APIDataProvider implements DataProvider {
    @Override
    public String getData() {
        return "Data from API";
    }
}
