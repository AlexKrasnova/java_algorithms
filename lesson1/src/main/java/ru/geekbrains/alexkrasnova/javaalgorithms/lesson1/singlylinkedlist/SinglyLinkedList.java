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

    public SinglyLinkedListItem<T> delete() {
        SinglyLinkedListItem<T> temp = first;
        first = first.getNext();
        return temp;
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
            if(current.getValue().equals(soughtForItem)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

}
