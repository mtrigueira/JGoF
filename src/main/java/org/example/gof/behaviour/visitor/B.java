package org.example.gof.behaviour.visitor;

class B implements Element {
    boolean hasOperationBBeenCalled = false;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitB(this);
    }

    public void operationB() {
        hasOperationBBeenCalled = true;
    }
}
