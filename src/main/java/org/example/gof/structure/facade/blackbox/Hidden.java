package org.example.gof.structure.facade.blackbox;

public class Hidden {
    public boolean secretOperationCalled = false;

    public void secretOperation() {
        secretOperationCalled = true;
    }
}
