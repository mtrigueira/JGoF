package org.example.gof.creation.abstractFactory;

public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();

    interface AbstractProductA {}
    interface AbstractProductB {}
}
