package org.example.gof.behaviour.template;

class ConcreteClass extends AbstractClass {
    boolean hasPrimitiveOperation1BeenCalled = false;
    boolean hasPrimitiveOperation2BeenCalled = false;

    @Override
    void primitiveOperation1() {
        hasPrimitiveOperation1BeenCalled = true;
    }

    @Override
    void primitiveOperation2() {
        hasPrimitiveOperation2BeenCalled = true;
    }
}
