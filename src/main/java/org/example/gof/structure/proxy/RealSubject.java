package org.example.gof.structure.proxy;

class RealSubject implements Subject {
    boolean operationCalled = false;

    @Override
    public void operation() {
        operationCalled = true;
    }
}
