package org.example.gof.creation.builder;

interface Builder<T> {
    void buildPart();

    T result();
}
