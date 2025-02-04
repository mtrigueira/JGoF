package org.example.gof.structure.adapter;

class Wrapper implements Target {
    final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.wrappedRequest();
    }
}
