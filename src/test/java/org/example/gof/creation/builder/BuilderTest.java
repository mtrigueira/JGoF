package org.example.gof.creation.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {
    @Test
    void test() {
        Builder<String> builder = new ConcreteBuilder();
        builder.buildPart();
        assertEquals("[Part]", builder.result());
    }

    @Test
    void test2() {
        Director director = new Director();
        Builder<?> builder = new ConcreteBuilder();
        director.construct(builder);
        assertEquals("[Part][Part]", builder.result());
    }

}
