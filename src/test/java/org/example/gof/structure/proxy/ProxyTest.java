package org.example.gof.structure.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProxyTest {
    @Test
    void test() {
        Subject proxy = new Proxy();

        assertNull(((Proxy)proxy).realSubject);
        proxy.operation();
        assertTrue(((RealSubject)((Proxy)proxy).realSubject).operationCalled);

        ((RealSubject)((Proxy)proxy).realSubject).operationCalled = false;
        proxy.operation();
        assertTrue(((RealSubject)((Proxy)proxy).realSubject).operationCalled);
    }
}
