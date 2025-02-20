package org.example.gof.structure.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompositeTest {
    @Test
    void testComposite() {
        Composite component = new Composite();
        Leaf a = new Leaf();
        Leaf b = new Leaf();
        component.children.add(a);
        component.children.add(b);
        assertFalse(a.operationCalled);
        assertFalse(b.operationCalled);

        component.operation();

        assertTrue(a.operationCalled);
        assertTrue(b.operationCalled);
    }
}
