package org.example.gof.behaviour.visitor;

class VisitorA implements Visitor {
    @Override
    public void visitA(A a) {
        a.operationA();
    }

    @Override
    public void visitB(B b) {
        b.operationB();
    }
}
