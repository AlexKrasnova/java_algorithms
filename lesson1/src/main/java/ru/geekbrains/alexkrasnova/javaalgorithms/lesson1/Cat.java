package ru.geekbrains.alexkrasnova.javaalgorithms.lesson1;

import java.util.Objects;

public class Cat {

    private String name;    // Ссылочный тип данных
    private int weight;     // Примитивный тип данных

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat anotherCat = (Cat) o;
        return weight == anotherCat.weight &&
                Objects.equals(name, anotherCat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    public void printInfo() {
        System.out.printf("Cat %s, weight %d\n", name, weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
