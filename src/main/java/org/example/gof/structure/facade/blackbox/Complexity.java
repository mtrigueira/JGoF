package org.example.gof.structure.facade.blackbox;

public class Complexity {
    public boolean complexOperationCalled = false;

    public void complexOperation() {
        complexOperationCalled = true;
    }
}
