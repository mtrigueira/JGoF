package org.example.gof.creation.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class FactoryMethodTest {
    @Test
    void createdObjectIsOfCorrectType() {
        Creator<?> creator = new ConcreteCreator();
        Object product = creator.factoryMethod();
        assertInstanceOf(Product.class, product);
    }
}
