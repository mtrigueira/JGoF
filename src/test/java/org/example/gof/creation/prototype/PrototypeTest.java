package org.example.gof.creation.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {
    @Test
    void test() throws CloneNotSupportedException {
        Prototype prototype = new ConcretePrototype("Value");
        Prototype clone = prototype.clone();
        assertInstanceOf(ConcretePrototype.class, clone);
        assertEquals("Value", ((ConcretePrototype)clone).value);
        assertNotEquals(prototype, clone); // This is a Java requirement for clone.
    }
}
