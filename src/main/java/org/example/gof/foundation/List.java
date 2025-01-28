package org.example.gof.foundation;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class List<T> implements Stack<T> {
    private final java.util.List<T> elements;
    public List(int i) {
        elements = new ArrayList<>(i);
    }

    public int count() {
        return elements.size();
    }

    public T get(int i) {
        if (i >= count() || i < 0)
            throw new NoSuchElementException();

        return elements.get(i);
    }

    public T first() {
        return elements.getFirst();
    }

    public T last() {
        return elements.getLast();
    }

    public void append(T element) {
        elements.add(element);
    }

    public void prepend(T element) {
        elements.addFirst(element);
    }

    public void remove(T element) {
        elements.remove(element);
    }

    public void removeFirst() {
        elements.removeFirst();
    }

    public void removeLast() {
        elements.removeLast();
    }

    public void removeAll() {
        elements.clear();
    }

    @Override
    public T top() {
        return last();
    }

    @Override
    public void push(T o) {
        append(o);
    }

    @Override
    public T pop() {
        T t = last();
        removeLast();
        return t;
    }
}
