package org.example.principles.D_SingleResponsibilityPrinciple.Solution.persistence;

public class DatabaseOrderPersistence implements OrderPersistence {
    @Override
    public String persist() {
        return "Database.";
    }
}
