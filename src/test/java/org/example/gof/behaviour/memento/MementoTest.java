package org.example.gof.behaviour.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoTest {
    @Test
    void testMemento() {
        Originator originator = new Originator();
        Memento memento = originator.memento();
        assertEquals("original", originator.state);

        originator.state = "changed";
        assertEquals("changed", originator.state);

        originator.recall(memento);
        assertEquals("original", originator.state);
    }
}
