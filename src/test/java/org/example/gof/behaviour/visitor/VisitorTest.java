package org.example.gof.behaviour.visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VisitorTest {
    private A a1;
    private B b1;
    private A a2;
    private final List<Element> elements = new ArrayList<>();
    private Iterator<Element> it;

    @BeforeEach
    void setUp() {
        a1 = new A();
        b1 = new B();
        a2 = new A();
        elements.add(a1);
        elements.add(b1);
        elements.add(a2);
        it = elements.iterator();
    }

    @Test
    void testVisitorA() {
        // This visitor calls the operations on the nodes
        Visitor visitor = new VisitorA();
        assertFalse(a1.hasOperationABeenCalled);
        assertFalse(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);

        it.next().accept(visitor);
        assertTrue(a1.hasOperationABeenCalled);
        assertFalse(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);
        it.next().accept(visitor);
        assertTrue(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);
        it.next().accept(visitor);
        assertTrue(a2.hasOperationABeenCalled);
    }

    @Test
    void testVisitorB() {
        // This visitor just counts, it doesn't call any methods on the visited
        // nodes.
        VisitorB visitor = new VisitorB();
        assertFalse(a1.hasOperationABeenCalled);
        assertFalse(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);

        it.next().accept(visitor);
        assertEquals(1, visitor.visits);
        it.next().accept(visitor);
        assertEquals(2, visitor.visits);
        it.next().accept(visitor);
        assertEquals(3, visitor.visits);
        assertFalse(a1.hasOperationABeenCalled);
        assertFalse(b1.hasOperationBBeenCalled);
        assertFalse(a2.hasOperationABeenCalled);
    }
}
