package ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.queue;

public interface CustomQueue<T> {

    void add(T element);

    T poll();

    T peek();

    boolean isEmpty();
}
