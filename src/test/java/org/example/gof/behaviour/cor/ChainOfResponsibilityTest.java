package org.example.gof.behaviour.cor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChainOfResponsibilityTest {
    @Test
    void test() {
        Concrete concreteB = new Concrete(null);
        Concrete concreteA = new Concrete(concreteB);

        assertFalse(concreteB.handleRequestCalled);
        assertFalse(concreteA.handleRequestCalled);
        concreteA.handleRequest();
        assertTrue(concreteB.handleRequestCalled);
        assertTrue(concreteA.handleRequestCalled);
    }

}
