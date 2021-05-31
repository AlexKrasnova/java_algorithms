package ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.stack;

public class ArrayCustomStack<T> implements CustomStack<T> {

    private T[] elements;
    private int indexOfLastElement;

    @SuppressWarnings("unchecked")
    public ArrayCustomStack(int maxSize) {
        elements = (T[]) new Object[maxSize];
        indexOfLastElement = -1;
    }

    @Override
    public void push(T element) {
        if (indexOfLastElement >= elements.length - 1) {
            throw new IllegalStateException("Стек переполнен.");
        }
        indexOfLastElement++;
        elements[indexOfLastElement] = element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст.");
        }
        return elements[indexOfLastElement];
    }

    @Override
    public T pop() {
        T result = peek();
        elements[indexOfLastElement] = null;
        indexOfLastElement--;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return indexOfLastElement < 0;
    }

}
