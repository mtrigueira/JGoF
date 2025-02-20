package org.example.gof.structure.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BridgeTest {
    @Test
    void testBridge() {
        Concrete concrete = new Concrete();
        Abstraction abstraction = new Refined(concrete);

        assertFalse(concrete.operationBWasCalled);
        abstraction.operationA();
        assertTrue(concrete.operationBWasCalled);
    }
}
