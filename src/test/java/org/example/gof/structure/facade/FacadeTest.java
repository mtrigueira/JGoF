package org.example.gof.structure.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacadeTest {
    @Test
    public void test() {
        Facade facade = new Facade();
        assertFalse(facade.hidden.secretOperationCalled);
        assertFalse(facade.complexity.complexOperationCalled);

        facade.operation();

        assertTrue(facade.hidden.secretOperationCalled);
        assertTrue(facade.complexity.complexOperationCalled);
    }

}
