package org.example.principles.H_DependencyInversionPrinciple.Solution.adjustment;

public class BasicAdjustment implements Adjustment {
    private int bass;
    private int treble;
    private Balance balance;
    private boolean centerpoint;

    public BasicAdjustment() {
        this.bass = 0;
        this.treble = 0;
        this.balance = Balance.CENTER;
        this.centerpoint = false;
    }

    @Override
    public void setBass(int value) {
        if (value < -6 || value > 6) {
            throw new IllegalArgumentException("Bass must be between -6 and +6");
        }
        this.bass = value;
    }

    @Override
    public int getBass() {
        return bass;
    }

    @Override
    public void setTreble(int value) {
        if (value < -6 || value > 6) {
            throw new IllegalArgumentException("Treble must be between -6 and +6");
        }
        this.treble = value;
    }

    @Override
    public int getTreble() {
        return treble;
    }

    @Override
    public void setBalance(Balance balance) {
        if (balance == null) {
            throw new IllegalArgumentException("Balance cannot be null.");
        }
        this.balance = balance;
    }

    @Override
    public Balance getBalance() {
        return balance;
    }

    @Override
    public void setCenterpoint(boolean enabled) {
        this.centerpoint = enabled;
    }

    @Override
    public boolean isCenterpointEnabled() {
        return centerpoint;
    }
}
