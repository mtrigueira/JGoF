package org.example.gof.creation.singleton;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {
    @Test
    void testSingleton() {
        Interface singleton = Singleton.instance();
        Interface singleton2 = Singleton.instance();
        assertSame(singleton, singleton2);
    }

    @Nested
    class ExtensionSingletonTest {
        @Test
        void testSubclassSingleton() {
            Interface original = Singleton.instance();
            Singleton.setInstance(Extension.instance());

            Interface singleton = Singleton.instance();
            assertInstanceOf(Extension.class, singleton);
            assertInstanceOf(Singleton.class, original);
            assertNotEquals(Singleton.class, singleton.getClass());
        }
    }
}
