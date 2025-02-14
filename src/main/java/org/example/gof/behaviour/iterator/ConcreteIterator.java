package org.example.gof.behaviour.iterator;

class ConcreteIterator<T> implements Iterator<T> {
    private final ConcreteIterable<T> concreteIterable;
    private int i = 0;

    public ConcreteIterator(ConcreteIterable<T> concreteIterable) {
        this.concreteIterable = concreteIterable;
    }

    public boolean hasNext() {
        return i == 0;
    }

    public T next() {
        return concreteIterable.getValueAtIndex(i++);
    }
}
