package org.example.gof.structure.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecoratorTest {
    @Test
    void testDecoratorWithAddedState() {
        Component component = new Concrete();
        Component decorator = new DecoratorWithAddedState(component);
        assertFalse(((Concrete) component).operationCalled);
        assertFalse(((DecoratorWithAddedState) decorator).addedState);

        decorator.operation();

        assertTrue(((Concrete) component).operationCalled);
        assertTrue(((DecoratorWithAddedState) decorator).addedState);
    }

    @Test
    void testDecoratorWithAddedBehavior() {
        Component component = new Concrete();
        Component decorator = new DecoratorWithAddedBehaviour(component);
        assertFalse(((Concrete) component).operationCalled);

        ((DecoratorWithAddedBehaviour) decorator).addedBehaviour();

        assertTrue(((Concrete) component).operationCalled);
    }

}
