package org.example.gof.structure.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdapterTest {
    @Test
    void testAdapter() {
        Target target = new Adapter();

        assertFalse(((Adaptee)target).wrappedRequestWasCalled);
        target.request();
        assertTrue(((Adaptee)target).wrappedRequestWasCalled);
    }

    @Test
    void tesWrapper() {
        Target target = new Wrapper();

        assertFalse(((Wrapper)target).adaptee.wrappedRequestWasCalled);
        target.request();
        assertTrue(((Wrapper)target).adaptee.wrappedRequestWasCalled);
    }

}
