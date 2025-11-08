package org.example.principles.D_SingleResponsibilityPrinciple;

public class DatabaseOrderPersistence implements OrderPersistence {
    @Override
    public String persist() {
        return "Database.";
    }
}
