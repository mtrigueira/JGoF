package org.example.gof.creation.builder;

class Director {
    public void construct(Builder<?> builder) {
        builder.buildPart();
        builder.buildPart();
    }
}
