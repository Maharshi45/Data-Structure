package com.maharshi.circularqueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.add(new Employee("Jane", "Jones", 123));
        queue.add(new Employee("John", "Doe", 4567));
        queue.add(new Employee("Mary", "Smith", 22));
        queue.add(new Employee("Mike", "Wilson", 3245));
        queue.remove();
        queue.remove();
        queue.add(new Employee("James", "Bond", 7));
        queue.add(new Employee("Bruce", "Wayne", 10));
        queue.add(new Employee("Kent", "Clark", 18));
        queue.add(new Employee("Barry", "Allen", 45));
        queue.remove();

        queue.printQueue();

    }
}