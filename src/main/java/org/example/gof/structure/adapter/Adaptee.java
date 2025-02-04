package org.example.gof.structure.adapter;

class Adaptee {
    public boolean wrappedRequestWasCalled = false;

    public void wrappedRequest() {
        wrappedRequestWasCalled = true;
    }
}
