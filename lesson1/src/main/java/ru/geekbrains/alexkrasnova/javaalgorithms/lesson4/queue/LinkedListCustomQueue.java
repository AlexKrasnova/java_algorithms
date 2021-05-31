package ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.queue;

import ru.geekbrains.alexkrasnova.javaalgorithms.lesson1.singlylinkedlist.SinglyLinkedList;
import ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.stack.LinkedListCustomStack;

public class LinkedListCustomQueue<T> implements CustomQueue<T> {

    SinglyLinkedList<T> elements;

    public LinkedListCustomQueue() {
        elements = new SinglyLinkedList<>();
    }

    @Override
    public void add(T element) {
        elements.insertLast(element);
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста.");
        }
        return elements.delete();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста.");
        }
        return elements.getFirstElement();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
