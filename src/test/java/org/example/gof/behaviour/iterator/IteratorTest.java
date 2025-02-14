package org.example.gof.behaviour.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTest {
    public static final int EXPECTED = 42;

    @Test
    void test() {
        Iterable<Integer> iterable = new ConcreteIterable<>(EXPECTED);
        Iterator<Integer> iterator = iterable.iterator();

        assertTrue(iterator.hasNext());
        assertEquals(EXPECTED, iterator.next());
        assertFalse(iterator.hasNext());
        assertThrows(IndexOutOfBoundsException.class, iterator::next);
    }
}
