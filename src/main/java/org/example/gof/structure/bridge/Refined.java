package org.example.gof.structure.bridge;

class Refined implements Abstraction {
    private final Implementor implementor;

    public Refined(Implementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public void operationA() {
        implementor.operationB();
    }
}
