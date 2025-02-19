package org.example.gof.behaviour.visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VisitorTest {
    private A a1;
    private B b1;
    private A a2;

    @BeforeEach
    void setUp() {
        a1 = new A();
        b1 = new B();
        a2 = new A();
    }

    @Test
    void testVisitorA() {
        // This visitor calls the operations on the nodes
        Visitor visitor = new VisitorA();
        assertFalse(a1.hasOperationABeenCalled);
        assertFalse(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);

        a1.accept(visitor);
        assertTrue(a1.hasOperationABeenCalled);
        assertFalse(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);
        b1.accept(visitor);
        assertTrue(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);
        a2.accept(visitor);
        assertTrue(a2.hasOperationABeenCalled);
    }

    @Test
    void testVisitorB() {
        // This visitor just counts, it doesn't call any methods on the visited
        // nodes.
        Visitor visitor = new VisitorB();
        assertFalse(a1.hasOperationABeenCalled);
        assertFalse(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);

        a1.accept(visitor);
        assertEquals(1, ((VisitorB) visitor).visits);
        assertFalse(a1.hasOperationABeenCalled);
        assertFalse(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);
        b1.accept(visitor);
        assertEquals(2, ((VisitorB) visitor).visits);
        assertFalse(a1.hasOperationABeenCalled);
        assertFalse(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);
        a2.accept(visitor);
        assertEquals(3, ((VisitorB) visitor).visits);
        assertFalse(a1.hasOperationABeenCalled);
        assertFalse(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);
    }
}
