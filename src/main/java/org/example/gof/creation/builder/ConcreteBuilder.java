package org.example.gof.creation.builder;

class ConcreteBuilder implements Builder<String> {
    final StringBuilder sb = new StringBuilder();

    @Override
    public void buildPart() {
        sb.append("[Part]");
    }

    @Override
    public String result() {
        return sb.toString();
    }
}
