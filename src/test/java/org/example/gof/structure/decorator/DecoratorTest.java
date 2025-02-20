package org.example.gof.structure.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecoratorTest {
    @Test
    void testDecoratorWithAddedState() {
        Concrete component = new Concrete();
        DecoratorWithAddedState decorator = new DecoratorWithAddedState(component);
        assertFalse(component.operationCalled);
        assertFalse(decorator.addedState);

        decorator.operation();

        assertTrue(component.operationCalled);
        assertTrue(decorator.addedState);
    }

    @Test
    void testDecoratorWithAddedBehavior() {
        Concrete component = new Concrete();
        DecoratorWithAddedBehaviour decorator = new DecoratorWithAddedBehaviour(component);
        assertFalse(component.operationCalled);

        decorator.addedBehaviour();

        assertTrue(component.operationCalled);
    }
}
