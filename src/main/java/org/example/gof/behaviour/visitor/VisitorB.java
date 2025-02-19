package org.example.gof.behaviour.visitor;

class VisitorB implements Visitor {
    int visits = 0;

    @Override
    public void visitA(A a) {
        visits++;
    }

    @Override
    public void visitB(B b) {
        visits++;
    }
}
