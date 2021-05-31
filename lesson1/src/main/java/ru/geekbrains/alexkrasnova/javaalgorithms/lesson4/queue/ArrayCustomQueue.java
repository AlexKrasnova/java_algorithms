package ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.queue;

public class ArrayCustomQueue<T> implements CustomQueue<T> {

    private T[] elements;
    int indexOfFirstElement;
    int indexOfLastElement;
    int numberOfElements;

    @SuppressWarnings("unchecked")
    public ArrayCustomQueue(int maxSize) {
        elements = (T[]) new Object[maxSize];
        indexOfLastElement = -1;
        indexOfFirstElement = -1;
        numberOfElements = 0;
    }

    @Override
    public void add(T element) {
        if (isFull()) {
            throw new IllegalStateException("Очередь переполнена.");
        }
        if(isEmpty()) {
            indexOfFirstElement = 0;
        }
        if(indexOfLastElement == elements.length - 1) {
            indexOfLastElement = 0;
        } else {
            indexOfLastElement++;
        }
        elements[indexOfLastElement] = element;
        numberOfElements++;
    }

    @Override
    public T poll() {
        T result = peek();
        elements[indexOfFirstElement] = null;
        indexOfFirstElement++;
        numberOfElements--;
        return result;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new IllegalStateException("Очередь пуста.");
        }
        return elements[indexOfFirstElement];
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public boolean isFull(){
        return numberOfElements >= elements.length;
    }
}
