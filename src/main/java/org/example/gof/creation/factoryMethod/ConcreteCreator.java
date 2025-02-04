package org.example.gof.creation.factoryMethod;

public class ConcreteCreator implements Creator<Product> {
    @Override
    public Product factoryMethod() {
        return new Product();
    }
}
