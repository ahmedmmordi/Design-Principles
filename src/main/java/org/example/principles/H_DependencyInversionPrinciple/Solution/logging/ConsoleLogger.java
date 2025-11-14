package org.example.principles.H_DependencyInversionPrinciple.Solution.logging;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(" - LOG: " + message);
    }
}
