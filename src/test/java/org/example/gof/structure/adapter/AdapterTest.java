package org.example.gof.structure.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdapterTest {
    @Test
    void testAdapter() {
        Target target = new AdapterSpy();

        assertFalse(((AdapterSpy)target).requestWasCalled);
        target.request();
        assertTrue(((AdapterSpy)target).requestWasCalled);
    }

    private static class AdapterSpy extends Adapter {
        public boolean requestWasCalled = false;

        @Override
        public void request() {
            super.request();
            requestWasCalled = true;
        }
    }
}
