package org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.printing;

import org.example.principles.G_InterfaceSegregationPrinciple.Solution.interfaces.security.Lockable;

import java.util.List;

public interface LockPrinter {
    void printAllLockStates(List<Lockable> locks);
}
