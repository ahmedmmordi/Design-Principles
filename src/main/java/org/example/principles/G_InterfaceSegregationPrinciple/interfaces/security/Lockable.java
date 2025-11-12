package org.example.principles.G_InterfaceSegregationPrinciple.interfaces.security;

public interface Lockable {
    void lock();
    void unlock();
    boolean isLocked();
}
