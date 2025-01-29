package org.example.gof.creation.abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class AbstractFactoryTest {
    @Test
    void test() {
        AbstractFactory factory = ConcreteFactory.INSTANCE;
        assertInstanceOf(ConcreteFactory.ProductA.class, factory.createProductA());
        assertInstanceOf(ConcreteFactory.ProductB.class, factory.createProductB());
    }
}
