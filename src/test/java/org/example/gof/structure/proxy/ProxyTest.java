package org.example.gof.structure.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProxyTest {
    @Test
    void test() {
        Proxy proxy = new Proxy();

        assertNull(proxy.realSubject);
        proxy.operation();
        assertTrue(((RealSubject) proxy.realSubject).operationCalled);

        ((RealSubject) proxy.realSubject).operationCalled = false;
        proxy.operation();
        assertTrue(((RealSubject) proxy.realSubject).operationCalled);
    }
}
