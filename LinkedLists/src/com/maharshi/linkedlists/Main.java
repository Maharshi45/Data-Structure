package com.maharshi.linkedlists;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        System.out.println(employeeLinkedList.isEmpty());

        employeeLinkedList.addToFront(janeJones);
        employeeLinkedList.addToFront(johnDoe);
        employeeLinkedList.addToFront(marySmith);
        employeeLinkedList.addToFront(mikeWilson);

        System.out.println("Size: " + employeeLinkedList.getSize());
        employeeLinkedList.printList();

        employeeLinkedList.removeFromFront();
        System.out.println("Size: " + employeeLinkedList.getSize());
        employeeLinkedList.printList();

    }

}