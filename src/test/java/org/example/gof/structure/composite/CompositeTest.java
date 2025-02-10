package org.example.gof.structure.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompositeTest {
    @Test
    void testComposite() {
        Component component = new Composite();
        Component a = new Leaf();
        Component b = new Leaf();
        ((Composite) component).children.add(a);
        ((Composite) component).children.add(b);
        assertFalse(((Leaf) a).operationCalled);
        assertFalse(((Leaf) b).operationCalled);

        component.operation();

        assertTrue(((Leaf) a).operationCalled);
        assertTrue(((Leaf) b).operationCalled);
    }

}
