package org.example.gof.structure.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BridgeTest {
    @Test
    void testBridge() {
        Concrete concrete = new ConcreteSpy();
        Abstraction abstraction = new Refined(concrete);

        assertFalse(((ConcreteSpy)concrete).operationWasCalled);
        abstraction.operationA();
        assertTrue(((ConcreteSpy)concrete).operationWasCalled);
    }

    protected class ConcreteSpy extends Concrete {
        public boolean operationWasCalled = false;

        @Override
        public void operationB() {
            super.operationB();
            operationWasCalled = true;
        }
    }
}
