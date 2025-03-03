package org.example.gof.structure.flyweight;

final class Flyweight {
    String op = "";

    void operation(String state) {
        op = "op " + state;
    }
}
