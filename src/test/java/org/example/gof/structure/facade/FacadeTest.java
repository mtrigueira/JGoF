package org.example.gof.structure.facade;

import org.example.gof.structure.facade.blackbox.Complexity;
import org.example.gof.structure.facade.blackbox.Hidden;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacadeTest {
    @Test
    public void test() {
        HiddenSpy hiddenSpy = new HiddenSpy();
        ComplexitySpy complexitySpy = new ComplexitySpy();
        Facade facade = new Facade(hiddenSpy, complexitySpy);
        assertFalse(hiddenSpy.secretOperationCalled);
        assertFalse(complexitySpy.complexOperationCalled);

        facade.operation();

        assertTrue(hiddenSpy.secretOperationCalled);
        assertTrue(complexitySpy.complexOperationCalled);
    }

    private static class HiddenSpy extends Hidden {
        public boolean secretOperationCalled = false;

        @Override
        public void secretOperation() {
            super.secretOperation();
            secretOperationCalled = true;
        }
    }

    private static class ComplexitySpy extends Complexity {
        public boolean complexOperationCalled = false;

        @Override
        public void complexOperation() {
            super.complexOperation();
            complexOperationCalled = true;
        }
    }
}
