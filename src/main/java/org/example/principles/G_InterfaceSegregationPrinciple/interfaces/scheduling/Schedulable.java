package org.example.principles.G_InterfaceSegregationPrinciple.interfaces.scheduling;

import java.time.LocalDateTime;

public interface Schedulable {
    void schedule(LocalDateTime time);
    LocalDateTime getTime();
}
