package ru.geekbrains.alexkrasnova.javaalgorithms.lesson4;

import ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.queue.ArrayCustomQueue;
import ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.queue.CustomQueue;
import ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.queue.LinkedListCustomQueue;
import ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.stack.ArrayCustomStack;
import ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.stack.CustomStack;
import ru.geekbrains.alexkrasnova.javaalgorithms.lesson4.stack.LinkedListCustomStack;

import java.util.*;

public class LessonFourApplication {
    public static void main(String[] args) {
        testStack();
        testQueue();
        testDequeAndPriorityQueue();
    }

    private static void testStack() {

        System.out.println("Тестирование различных стеков:\n");

        // Тестирование работы стека из стандартной библиотеки Java
        System.out.println("Стандартный стек:");
        List<String> strings = getStringList();
        Stack<String> stack = new Stack<>();
        Map<String, Long> timesForStack = new HashMap<>();
        Map<String, Long> timesForCustomStack = new HashMap<>();

        long startTime = System.nanoTime();
        for (String element : strings) {
            stack.push(element);
        }
        timesForStack.put("Время на добавление элементов в стек, нс", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        System.out.println(stack.peek());
        timesForStack.put("Время на просмотр последнего элемента, нс", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        timesForStack.put("Время на удаление всех элементов, нс", System.nanoTime() - startTime);

        // Тестирование пользовательского стека, основанного на массиве
        CustomStack<String> arrayCustomStack = new ArrayCustomStack<>(6);
        CustomStack<String> linkedListCustomStack = new LinkedListCustomStack<>();

        System.out.println("Значения для стандартного стека:\n" + timesForStack + "\n");
        System.out.println("Значения для пользовательского стека, основанного на массиве:\n" + testCustomStackAndGetTimes(arrayCustomStack) + "\n");
        System.out.println("Значения для пользовательского стека, основанного на связанном списке:\n" + testCustomStackAndGetTimes(linkedListCustomStack) + "\n");

        System.out.println();
    }

    public static Map<String, Long> testCustomStackAndGetTimes(CustomStack stack) {

        System.out.println("Пользовательский стек " + stack.getClass() + ":");

        Map<String, Long> times = new HashMap<>();

        long startTime = System.nanoTime();
        for (String element : getStringList()) {
            stack.push(element);
        }
        times.put("Время на добавление элементов в стек, нс", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        System.out.println(stack.peek());
        times.put("Время на просмотр последнего элемента, нс", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        times.put("Время на удаление всех элементов, нс", System.nanoTime() - startTime);

        return times;
    }

    private static void testQueue() {

        System.out.println("Тестирование различных очередей:\n");

        // Тестирование работы очереди из стандартной библиотеки Java
        System.out.println("Стандартная очередь:");
        List<String> strings = getStringList();
        Queue<String> queue = new LinkedList<>();
        Map<String, Long> timesForQueue = new HashMap<>();
        Map<String, Long> timesForCustomQueue = new HashMap<>();

        long startTime = System.nanoTime();
        for (String element : strings) {
            queue.add(element);
        }
        timesForQueue.put("Время на добавление элементов в очередь, нс", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        System.out.println(queue.peek());
        timesForQueue.put("Время на просмотр первого элемента, нс", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        timesForQueue.put("Время на удаление всех элементов, нс", System.nanoTime() - startTime);

        // Тестирование пользовательской очереди
        CustomQueue<String> arrayCustomQueue = new ArrayCustomQueue<>(6);
        CustomQueue<String> linkedListCustomQueue = new LinkedListCustomQueue<>();

        System.out.println("Значения для стандартной очереди:\n" + timesForQueue + "\n");
        System.out.println("Значения для пользовательской очереди, основанной на массиве:\n" + testCustomQueueAndGetTimes(arrayCustomQueue) + "\n");
        System.out.println("Значения для пользовательской очереди, основанной на односвязном списке:\n" + testCustomQueueAndGetTimes(linkedListCustomQueue) + "\n");

        System.out.println();

    }

    public static Map<String, Long> testCustomQueueAndGetTimes(CustomQueue queue) {
        System.out.println("Пользовательская очередь " + queue.getClass() + ":");
        Map<String, Long> times = new HashMap<>();

        long startTime = System.nanoTime();
        for (String element : getStringList()) {
            queue.add(element);
        }
        times.put("Время на добавление элементов в очередь, нс", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        System.out.println(queue.peek());
        times.put("Время на просмотр первого элемента, нс", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        times.put("Время на удаление всех элементов, нс", System.nanoTime() - startTime);

        return times;
    }

    public static void testDequeAndPriorityQueue() {

        System.out.println("Тестирование двусторонней и приоритетной очередей:\n");

        List<String> strings = getStringList();
        Map<String, Long> timesForDeque = new HashMap<>();
        Map<String, Long> timesForPriorityQueue = new HashMap<>();

        // Тестирование работы двусторонней очереди из стандартной библиотеки Java
        System.out.println("Стандартная двусторонняя очередь:");
        Deque<String> deque = new ArrayDeque<>();

        long startTime = System.nanoTime();
        deque.add(strings.get(0));
        timesForDeque.put("Время на добавление элемента методом add() (аналогично добавлению в конец очереди), нс", System.nanoTime() - startTime);
        deque.add(strings.get(1));
        deque.add(strings.get(2));

        startTime = System.nanoTime();
        deque.addFirst(strings.get(3));
        timesForDeque.put("Время на добавление элемента в начало очереди, нс", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        deque.addLast(strings.get(4));
        timesForDeque.put("Время на добавление элемента в конец очереди, нс", System.nanoTime() - startTime);

        System.out.println("Расположение элементов в очереди:");
        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }
        deque.add(strings.get(0));
        deque.add(strings.get(1));
        deque.add(strings.get(2));
        deque.addFirst(strings.get(3));
        deque.addLast(strings.get(4));

        System.out.println("Удаление отдельных элементов из очереди:");

        startTime = System.nanoTime();
        System.out.println(deque.pollLast());
        ;
        timesForDeque.put("Время на удаление элемента из конца очереди, нс", System.nanoTime() - startTime);

        startTime = System.nanoTime();
        System.out.println(deque.pollFirst());
        ;
        timesForDeque.put("Время на удаление элемента из начала очереди, нс", System.nanoTime() - startTime);

        System.out.println("Значения для двусторонней очереди:\n" + timesForDeque);
        System.out.println("Значения для приоритетной очереди:\n" + timesForPriorityQueue);


        // Тестирование работы приоритетной очереди из стандартной библиотеки Java
        System.out.println("Стандартная приоритетная очередь:");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(0);
        priorityQueue.add(1);
        startTime = System.nanoTime();
        priorityQueue.add(4);
        timesForPriorityQueue.put("Время на добавление элемента, нс", System.nanoTime() - startTime);
        priorityQueue.add(3);
        priorityQueue.add(2);

        startTime = System.nanoTime();
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        timesForPriorityQueue.put("Время на удаление элементов, нс", System.nanoTime() - startTime);

        System.out.println("Значения для двусторонней очереди:\n" + timesForDeque);
        System.out.println("Значения для приоритетной очереди:\n" + timesForPriorityQueue);
    }

    public static List<String> getStringList() {

        List<String> strings = new ArrayList<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");

        return strings;
    }
}
