package org.example.gof.structure.adapter;

class Adapter implements Target {
    final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.request();
    }
}
