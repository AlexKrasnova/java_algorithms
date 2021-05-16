package ru.geekbrains.alexkrasnova.javaalgorithms.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Luna", 8));
        cats.add(new Cat("Cleo", 7));
        cats.add(new Cat("Nala", 8));
        cats.add(new Cat("Mrs. Norris", 10));
        cats.add(new Cat("Kitty", 10));
        cats.add(new Cat("Oliver", 11));
        cats.add(new Cat("Leo", 9));
        cats.add(new Cat("Simba", 10));
        cats.add(new Cat("Tiger", 13));
        cats.add(new Cat("Max", 12));

        for (Cat cat : cats) {
            cat.printInfo();
        }

    }
}
