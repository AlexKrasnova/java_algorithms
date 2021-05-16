package ru.geekbrains.alexkrasnova.javaalgorithms.lesson1;

public class Cat {

    private String name;    // Ссылочный тип данных
    private int weight;     // Примитивный тип данных

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.printf("Cat %s, weight %d\n", name, weight);
    }

}
