package com.maharshi.linkedstack;

public class Main {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("James", "Bond", 7));

        stack.printStack();

        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.printStack();

    }
}