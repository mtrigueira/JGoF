package org.example.gof.creation.singleton;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {
    @Test
    void testSingleton() {
        Singleton singleton = Singleton.instance();
        Singleton singleton2 = Singleton.instance();
        assertSame(singleton, singleton2);
    }

    @Nested
    class ExtensionSingletonTest {
        @Test
        void testSubclassSingleton() {
            Extension.override();

            Singleton singleton = Singleton.instance();
            assertInstanceOf(Extension.class, singleton);
            assertInstanceOf(Singleton.class, singleton); // Liskov Substitution Principle
            assertNotEquals(Singleton.class, singleton.getClass());
        }
    }
}
