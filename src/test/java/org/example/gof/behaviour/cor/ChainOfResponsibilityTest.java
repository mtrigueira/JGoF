package org.example.gof.behaviour.cor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChainOfResponsibilityTest {
    @Test
    void test() {
        Handler concreteB = new Concrete(null);
        Handler concreteA = new Concrete(concreteB);

        assertFalse(((Concrete) concreteB).handleRequestCalled);
        assertFalse(((Concrete) concreteA).handleRequestCalled);
        concreteA.handleRequest();
        assertTrue(((Concrete) concreteB).handleRequestCalled);
        assertTrue(((Concrete) concreteA).handleRequestCalled);
    }

}
