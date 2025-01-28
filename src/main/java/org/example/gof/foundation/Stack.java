package org.example.gof.foundation;

public interface Stack<T> {
    T top();
    void push(T t);
    T pop();
}
