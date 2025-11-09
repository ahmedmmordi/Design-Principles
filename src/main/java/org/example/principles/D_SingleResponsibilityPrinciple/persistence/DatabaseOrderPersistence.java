package org.example.principles.D_SingleResponsibilityPrinciple.persistence;

public class DatabaseOrderPersistence implements OrderPersistence {
    @Override
    public String persist() {
        return "Database.";
    }
}
