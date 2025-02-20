package org.example.gof.behaviour.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {
    @Test
    void testObserver() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver(subject);
        assertEquals("original", observer.concreteSubjectObservedState);

        subject.setState("changed");
        assertEquals("changed", observer.concreteSubjectObservedState);

        subject.detach(observer);
        subject.setState("changed again");
        assertEquals("changed", observer.concreteSubjectObservedState);

        assertDoesNotThrow(() -> subject.detach(observer));
    }
}
