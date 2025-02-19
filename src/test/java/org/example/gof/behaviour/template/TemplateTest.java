package org.example.gof.behaviour.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemplateTest {
    @Test
    void test() {
        ConcreteClass concreteClass = new ConcreteClass();
        assertFalse(concreteClass.hasPrimitiveOperation1BeenCalled);
        assertFalse(concreteClass.hasPrimitiveOperation2BeenCalled);

        concreteClass.templateMethod();
        assertTrue(concreteClass.hasPrimitiveOperation1BeenCalled);
        assertTrue(concreteClass.hasPrimitiveOperation2BeenCalled);
    }
}
