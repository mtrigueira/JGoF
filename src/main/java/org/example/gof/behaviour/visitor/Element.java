package org.example.gof.behaviour.visitor;

interface Element {
    void accept(Visitor visitor);
}
