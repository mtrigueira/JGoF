package org.example.gof.behaviour.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MediatorTest {
    @Test
    void testMediator() {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new Colleague(mediator);
        Colleague colleagueB = new Colleague(mediator);
        colleagueA.operation();

        assertTrue(colleagueB.wasOperationCalled);
        colleagueA.wasOperationCalled = false;
        colleagueB.operation();
        assertFalse(colleagueA.wasOperationCalled);
    }
}
