package org.example.gof.structure.bridge;

class Concrete implements Implementor {
    public boolean operationBWasCalled = false;

    @Override
    public void operationB() {
        operationBWasCalled = true;
    }
}
