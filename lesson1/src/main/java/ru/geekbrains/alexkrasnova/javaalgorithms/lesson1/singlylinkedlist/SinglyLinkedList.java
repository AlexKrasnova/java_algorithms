package ru.geekbrains.alexkrasnova.javaalgorithms.lesson1.singlylinkedlist;

import java.util.LinkedList;

public class SinglyLinkedList<T> {

    SinglyLinkedListItem<T> first;

    public SinglyLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(T value) {
        SinglyLinkedListItem<T> item = new SinglyLinkedListItem<>(value, first);
        this.first = item;
    }

    public void insertLast(T value) {
        SinglyLinkedListItem<T> item = new SinglyLinkedListItem<>(value);
        if (isEmpty()) {
            first = item;
            return;
        }
        SinglyLinkedListItem<T> lastItem = first;
        while (lastItem.hasNext()) {
            lastItem = lastItem.getNext();
        }
        lastItem.setNext(item);
    }

    public T delete() {
        SinglyLinkedListItem<T> temp = first;
        first = first.getNext();
        return temp.getValue();
    }

    public void display() {
        SinglyLinkedListItem<T> current = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public T find(T soughtForItem) {
        SinglyLinkedListItem<T> current = first;
        while (current != null) {
            if (current.getValue().equals(soughtForItem)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public T getFirstElement() {
        return first.getValue();
    }

}
