package org.example.principles.H_DependencyInversionPrinciple.Solution.adjustment;

public interface Adjustment {
    enum Balance {
        LEFT,
        CENTER,
        RIGHT
    }
    void setBass(int value);
    int getBass();
    void setTreble(int value);
    int getTreble();
    void setBalance(Balance balance);
    Balance getBalance();
    void setCenterpoint(boolean enabled);
    boolean isCenterpointEnabled();
}
