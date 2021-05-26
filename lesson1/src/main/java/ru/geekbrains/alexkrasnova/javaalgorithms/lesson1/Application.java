package ru.geekbrains.alexkrasnova.javaalgorithms.lesson1;

import ru.geekbrains.alexkrasnova.javaalgorithms.lesson1.singlylinkedlist.SinglyLinkedList;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        //Задание к уроку 3
        testListMethodsAndIterator();

        System.out.println();

        testCustomSinglyLinkedList();

        /*// Задание к уроку 2
        System.out.println("Тестирование методов из класса Arrays: \n");
        testArrayMethods();

        System.out.println("\nТестирование алгоритмов поиска:\n");
        testDifferentSearchingAlgorithms();

        System.out.println("\nТестирование различныйх алгоритмов сортироки:\n");
        testDifferentSortingAlgorithms();*/

        /*// Задание к уроку 1
        testCatClass();*/

    }

    public static void testCustomSinglyLinkedList() {

        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        list.insert("Jack");
        list.insert("John");
        list.insert("Sally");
        list.insert("Molly");
        list.insert("Charly");

        list.display();

        System.out.println("Удаляем элемент " + list.delete().getValue());

        list.display();

        System.out.println("Найден элемент " + list.find("Sally"));

    }

    public static void testListMethodsAndIterator() {
        String[] stringArray = new String[5];

        stringArray[0] = "One";
        stringArray[1] = "Two";
        stringArray[2] = "Three";
        stringArray[3] = "Four";
        stringArray[4] = "Five";

        // Тестируем методы ArrayList
        System.out.println("Тестируем ArrayList\n");

        long startTime = System.nanoTime();
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        long arrayToArrayListTime = System.nanoTime() - startTime;
        Collection<String> stringCollection = new ArrayList<>(Arrays.asList(stringArray));
        long arrayToCollectionTime = System.nanoTime() - arrayToArrayListTime;

        System.out.println("String[] stringArray = " + Arrays.toString(stringArray));
        System.out.println("List<String> stringList = " + stringList);
        System.out.println("Collection<String> stingCollection = " + stringCollection);

        System.out.println();

        startTime = System.nanoTime();
        stringList.add("Six");
        long addItemTime = System.nanoTime() - startTime;

        System.out.println("Список после добавления элемента: " + stringList);

        startTime = System.nanoTime();
        stringList.add(2, "Another Two");
        long addItemToPositionTime = System.nanoTime() - startTime;

        System.out.println("Список после добавления элемента в середину списка: " + stringList);

        startTime = System.nanoTime();
        stringList.set(3, "New Three");
        long setItemTime = System.nanoTime() - startTime;

        System.out.println("Список после замены элемента: " + stringList);

        startTime = System.nanoTime();
        stringList.remove(1);
        long removeItemByPositionTime = System.nanoTime() - startTime;

        System.out.println("Список после удаления элемента по индексу: " + stringList);

        startTime = System.nanoTime();
        stringList.remove("Six");
        long removeItemTime = System.nanoTime() - startTime;

        System.out.println("Список после удаления элемента: " + stringList);

        System.out.println();

        System.out.printf("Время на конвертацию массива в ArrayList: %d, нс;\n" +
                        "Время на конвертацию массива в Collection: %d, нс;\n" +
                        "Время на добавления элемента в  конец в ArrayList: %d, нс;\n" +
                        "Время на добавления элемента на конкретную позицию в ArrayList: %d, нс;\n" +
                        "Время на изменение элемента в ArrayList: %d, нс;\n" +
                        "Время на удаление элемента по индексу из ArrayList: %d, нс;\n" +
                        "Время на удаление элемента из ArrayList: %d, нс;\n",
                arrayToArrayListTime,
                arrayToCollectionTime,
                addItemTime,
                addItemToPositionTime,
                setItemTime,
                removeItemByPositionTime,
                removeItemTime);


        // Тестируем методы LinkedList
        System.out.println("\nТестируем LinkedList\n");

        startTime = System.nanoTime();
        LinkedList<String> stringLinkedList = new LinkedList<>(stringList);
        long arrayListToLinkedListTime = System.nanoTime() - startTime;
        System.out.println("LinkedList<String> stingLinkedList = " + stringLinkedList);

        startTime = System.nanoTime();
        stringLinkedList.add("Six");
        addItemTime = System.nanoTime() - startTime;

        System.out.println("Список после добавления элемента: " + stringLinkedList);

        startTime = System.nanoTime();
        stringLinkedList.add(1, "Another One");
        addItemToPositionTime = System.nanoTime() - startTime;

        System.out.println("Список после добавления элемента в середину списка: " + stringLinkedList);

        startTime = System.nanoTime();
        stringLinkedList.set(6, "New Six");
        setItemTime = System.nanoTime() - startTime;

        System.out.println("Список после замены элемента: " + stringLinkedList);

        startTime = System.nanoTime();
        stringLinkedList.remove(6);
        removeItemByPositionTime = System.nanoTime() - startTime;

        System.out.println("Список после удаления элемента по индексу: " + stringLinkedList);

        startTime = System.nanoTime();
        stringLinkedList.remove("Five");
        removeItemTime = System.nanoTime() - startTime;

        System.out.println("Список после удаления элемента: " + stringLinkedList);

        System.out.println();

        System.out.printf("Время на конвертацию ArrayList в LinkedList: %d, нс;\n" +
                        "Время на добавления элемента в  конец в LinkedList: %d, нс;\n" +
                        "Время на добавления элемента на конкретную позицию в LinkedList: %d, нс;\n" +
                        "Время на изменение элемента в LinkedList: %d, нс;\n" +
                        "Время на удаление элемента по индексу из LinkedList: %d, нс;\n" +
                        "Время на удаление элемента из LinkedList: %d, нс;\n",
                arrayListToLinkedListTime,
                addItemTime,
                addItemToPositionTime,
                setItemTime,
                removeItemByPositionTime,
                removeItemTime);

        LinkedList<Cat> catLinkedList = new LinkedList<>();
        catLinkedList.add(new Cat("Пушок", 11));
        catLinkedList.add(new Cat("Мурка", 10));
        catLinkedList.add(new Cat("Луна", 10));

        System.out.println("\nТестируем итераторы\n");

        Iterator<String> stringIterator = stringLinkedList.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next().toString());
            stringIterator.remove();
        }

        Iterator<Cat> catIterator = catLinkedList.iterator();
        while (catIterator.hasNext()) {
            System.out.println(catIterator.next().toString());
            catIterator.remove();
        }
    }

    public static void testArrayMethods() {
        int[] intArray;
        int[] intArrayCopy;
        int arrayLength = 10;
        int valuesBound = 15;
        Random random = new Random();
        long time0;

        intArray = generateRandomArray(arrayLength, valuesBound);

        System.out.println("Исходный массив: " + Arrays.toString(intArray));

        // Копирование массива с оценкой затраченного времени
        time0 = System.nanoTime();
        intArrayCopy = Arrays.copyOf(intArray, intArray.length);
        long timeCopy = System.nanoTime() - time0;
        System.out.println("Копия массива: " + Arrays.toString(intArrayCopy));

        // Проверка равенства двух массивов с оценкой затраченного времени
        time0 = System.nanoTime();
        System.out.println("Массивы intArray и intArrayCopy равны: " + Arrays.equals(intArray, intArrayCopy));
        long timeEquals = System.nanoTime() - time0;


        // Быстрая сортировка массива с оценкой затраченного времени
        time0 = System.nanoTime();
        Arrays.sort(intArray);
        long timeSort = System.nanoTime() - time0;
        System.out.println("Отсортированный массив: " + Arrays.toString(intArray));

        System.out.printf("Время на копирование массива: %d, нс;\n" +
                        "Время на проверку равенства двух массивов: %d, нс;\n" +
                        "Время на сортировку массива: %d, нс.\n",
                timeCopy, timeEquals, timeSort);
    }

    public static void testDifferentSearchingAlgorithms() {

        int soughtForElement = 33;
        int[] unsortedArray = generateRandomArray(400, 400);
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(sortedArray);
        System.out.println("Исходный массив: " + Arrays.toString(unsortedArray));
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));

        // Двоичный поиск элемента при помощи метода Arrays.binarySearch() с оценкой затраченного времени
        long time0 = System.nanoTime();
        System.out.println("Двоичный поиск методом Arrays.binarySearch(). Индекс элемента равного " + soughtForElement + ": " + Arrays.binarySearch(sortedArray, soughtForElement));
        long timeBinarySearchFromArrays = System.nanoTime() - time0;

        // Двоичный поиск элемента с оценкой затраченного времени
        time0 = System.nanoTime();
        System.out.println("Двоичный поиск в отсортированном массиве. Индекс элемента равного " + soughtForElement + ": " + findElementBinary(sortedArray, soughtForElement));
        long timeBinarySearchUser = System.nanoTime() - time0;

        // Линейный поиск элемента с оценкой затраченного времени
        time0 = System.nanoTime();
        System.out.println("Линейный поиск в неотсортированном массиве. Индекс элемента равного " + soughtForElement + ": " + findElement(unsortedArray, soughtForElement));
        long timeLinearSearchUser = System.nanoTime() - time0;

        System.out.printf("Время на двоичный поиск элемента методом Arrays.binarySearch(): %d, нс;\n" +
                "Время на двоичный поиск элемента пользовательским методом: %d, нс;\n" +
                "Время на линейный поиск элемента пользовательским методом: %d, нс.\n", timeBinarySearchFromArrays, timeBinarySearchUser, timeLinearSearchUser);
    }

    public static int[] generateRandomArray(int arrayLength, int valuesBound) {

        Random random = new Random();
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(valuesBound);
        }
        return array;
    }

    public static void testDifferentSortingAlgorithms() {

        int arrayLength = 400;
        int valuesBound = 1000;
        int[] array = generateRandomArray(arrayLength, valuesBound);
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int[] arrayCopy = Arrays.copyOf(array, array.length);

        // Быстрая сортировка массива методом Arrays.sort() с оценкой затраченного времени
        long time0 = System.nanoTime();
        Arrays.sort(array);
        long timeQuickSort = System.nanoTime() - time0;
        System.out.println("Массив, отсортированный методом Arrays.sort(): " + Arrays.toString(array));


        // Сортировка пузырьком с оценкой затраченного времени
        array = Arrays.copyOf(arrayCopy, arrayCopy.length);
        time0 = System.nanoTime();
        sortByBubble(array);
        long timeBubble = System.nanoTime() - time0;
        System.out.println("Массив, отсортированный методом пузырька: " + Arrays.toString(array));

        // Сортировка методом выбора с оценкой затраченного времени
        array = Arrays.copyOf(arrayCopy, arrayCopy.length);
        time0 = System.nanoTime();
        sortBySelection(array);
        long timeSelection = System.nanoTime() - time0;
        System.out.println("Массив, отсортированный методом выбора: " + Arrays.toString(array));

        // Сортировка методом вставки с оценкой затраченного времени
        array = Arrays.copyOf(arrayCopy, arrayCopy.length);
        time0 = System.nanoTime();
        sortByInsertion(array);
        long timeInsertion = System.nanoTime() - time0;
        System.out.println("Массив, отсортированный методом вставки: " + Arrays.toString(array));

        System.out.printf("Время на быструю сортировку с импользованием метода Arrays.sort(), нс: %d;\n" +
                        "Врема на сортировку пузырьком: %d, нс (в %.2f раз дольше, чем быстрая сортировка);\n" +
                        "Врема на сортировку методом выбора: %d, нс (в %.2f раз дольше, чем быстрая сортировка);\n" +
                        "Врема на сортировку методом вставки: %d, нс (в %.2f раз дольше, чем быстрая сортировка);\n",
                timeQuickSort, timeBubble, (double) timeBubble / timeQuickSort, timeSelection, (double) timeSelection / timeQuickSort, timeInsertion, (double) timeInsertion / timeQuickSort);


    }

    public static <T> int findElement(T[] array, T soughtForElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(soughtForElement)) {
                return i;
            }
        }
        return -1;
    }

    // Линейный поиск
    public static int findElement(int[] array, int soughtForElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == soughtForElement) {
                return i;
            }
        }
        return -1;
    }

    // Двоичный поиск в отсортированном массиве
    public static int findElementBinary(int[] array, int soughtForElement) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int index;
        while (firstIndex <= lastIndex) {
            index = (firstIndex + lastIndex) >>> 1;
            if (array[index] == soughtForElement) {
                return index;
            } else if (array[index] > soughtForElement) {
                lastIndex = index - 1;
            } else if (array[index] < soughtForElement) {
                firstIndex = index + 1;
            }
        }
        return -1;
    }

    public static void sortByBubble(int[] array) {
        int buff;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    buff = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = buff;
                }
            }
        }
    }

    public static void sortBySelection(int[] array) {
        int buff;
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                buff = array[i];
                array[i] = array[minIndex];
                array[minIndex] = buff;
            }
        }
    }

    public static void sortByInsertion(int[] array) {
        int in;
        int buff;

        for (int i = 1; i < array.length; i++) {
            buff = array[i];
            in = i;

            while (in > 0 && array[in - 1] >= buff) {
                array[in] = array[in - 1];
                in--;
            }
            array[in] = buff;
        }
    }

    // Домашнее задание к уроку 1
    public static void testCatClass() {
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

        Cat anotherCat = new Cat("Tiger", 13);

        long time1 = System.nanoTime();
        int elementIndex = findElement(cats.toArray(), anotherCat);
        System.out.println("Spent time, nanoseconds: " + (System.nanoTime() - time1));

        if (elementIndex != -1) {
            System.out.println("Cat is found. Element index is " + elementIndex);
        }
    }
}
