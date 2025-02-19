package org.example.gof.behaviour.visitor;

class A implements Element {
    boolean hasOperationABeenCalled = false;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitA(this);
    }

    public void operationA() {
        hasOperationABeenCalled = true;
    }
}
