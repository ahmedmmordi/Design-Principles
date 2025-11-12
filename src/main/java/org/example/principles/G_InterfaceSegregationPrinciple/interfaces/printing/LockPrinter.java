package org.example.principles.G_InterfaceSegregationPrinciple.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.interfaces.security.Lockable;

import java.util.List;

public interface LockPrinter {
    void printAllLockStates(List<Lockable> locks);
}
