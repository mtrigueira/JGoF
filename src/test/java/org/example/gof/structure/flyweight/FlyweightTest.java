package org.example.gof.structure.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightTest {
    @Test
    void test() {
        Flyweight flyweight = new Flyweight();

        flyweight.operation("A");
        assertEquals("op A", flyweight.op);
        flyweight.operation("B");
        assertEquals("op B", flyweight.op);
    }

    private static final class Flyweight {
        private String op = "";

        void operation(String state) {
            op = "op "+state;
        }
    }
}
