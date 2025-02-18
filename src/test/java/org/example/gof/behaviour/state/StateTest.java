package org.example.gof.behaviour.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StateTest {
    @Test
    void testState() {
        Context context = new Context();
        assertFalse(context.stateA.wasHandleCalled);
        assertFalse(context.stateB.wasHandleCalled);

        context.request();
        assertTrue(context.stateA.wasHandleCalled);
        assertFalse(context.stateB.wasHandleCalled);

        context.stateA.wasHandleCalled = false;
        context.request();
        assertFalse(context.stateA.wasHandleCalled);
        assertTrue(context.stateB.wasHandleCalled);
    }
}
