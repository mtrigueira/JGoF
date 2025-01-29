package org.example.gof.creation.abstractFactory;

class ConcreteFactory implements AbstractFactory {
    static final ConcreteFactory INSTANCE = new ConcreteFactory();

    public AbstractProductA createProductA() {
        return new ProductA();
    }

    public AbstractProductB createProductB() {
        return new ProductB();
    }

    static class ProductA implements AbstractProductA {}
    static class ProductB implements AbstractProductB {}
}
