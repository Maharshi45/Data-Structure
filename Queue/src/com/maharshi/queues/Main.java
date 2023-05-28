package com.maharshi.queues;

public class Main {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(new Employee("Jane", "Jones", 123));
        queue.add(new Employee("John", "Doe", 4567));
        queue.add(new Employee("Mary", "Smith", 22));
        queue.add(new Employee("Mike", "Wilson", 3245));
        queue.add(new Employee("James", "Bond", 7));

//        queue.printQueue();

        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println("Peek: " + queue.peek());
        queue.remove();
        queue.remove();
        queue.remove();
        queue.printQueue();
    }
}