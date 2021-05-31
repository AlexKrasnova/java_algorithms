package ru.geekbrains.alexkrasnova.javaalgorithms.lesson1.singlylinkedlist;

public class SinglyLinkedListItem<T> {

    T value;
    SinglyLinkedListItem<T> next;

    public SinglyLinkedListItem(T value) {
        this.value = value;
    }

    public SinglyLinkedListItem(T value, SinglyLinkedListItem<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public SinglyLinkedListItem<T> getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListItem<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
