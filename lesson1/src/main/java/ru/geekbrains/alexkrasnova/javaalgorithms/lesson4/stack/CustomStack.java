package ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.stack;

public interface CustomStack<T> {

    void push(T element);

    T peek();

    T pop();

    boolean isEmpty();

}
