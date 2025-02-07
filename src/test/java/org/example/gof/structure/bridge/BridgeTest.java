package org.example.gof.structure.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BridgeTest {
    @Test
    void testBridge() {
        Implementor implementor = new Concrete();
        Abstraction abstraction = new Refined(implementor);

        assertFalse(((Concrete) implementor).operationBWasCalled);
        abstraction.operationA();
        assertTrue(((Concrete) implementor).operationBWasCalled);
    }

}
