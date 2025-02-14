package org.example.gof.behaviour.iterator;

class ConcreteIterable<T> implements Iterable<T> {
    private final T value;

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(this);
    }

    public T getValueAtIndex(int index) {
        if (index != 0)
            throw new IndexOutOfBoundsException();

        return value;
    }

    ConcreteIterable(T value) {
        this.value = value;
    }
}
