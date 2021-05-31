package ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.stack;

import ru.geekbrains.alexkrasnova.javaalgorithms.lesson1.singlylinkedlist.SinglyLinkedList;

public class LinkedListCustomStack<T> implements CustomStack<T> {

    SinglyLinkedList<T> elements;

    public LinkedListCustomStack() {
        elements = new SinglyLinkedList<>();
    }

    @Override
    public void push(T element) {
        elements.insert(element);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст.");
        }
        return elements.getFirstElement();
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст.");
        }
        return elements.delete();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
