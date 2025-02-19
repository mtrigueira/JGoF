package org.example.gof.behaviour.visitor;

import java.util.ArrayList;
import java.util.List;

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
