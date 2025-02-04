package org.example.gof.structure.adapter;

class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.wrappedRequest();
    }
}
