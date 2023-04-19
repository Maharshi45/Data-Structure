package com.maharshi.linkedlists;

import java.util.Objects;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public boolean addAfter(Employee existingEmployee, Employee newEmployee) {
        if (Objects.isNull(newEmployee)) {
            return false;
        }
        if (Objects.nonNull(head)) {
            EmployeeNode temp = this.head;
            while (Objects.nonNull(temp) && !temp.getEmployee().equals(existingEmployee)) {
                temp = temp.getNext();
            }
            if (Objects.nonNull(temp)) {
                return linkNode(newEmployee, temp);
            }
            return false;
        } else {
            return false;
        }
    }

    public boolean addBefore(Employee existingEmployee, Employee newEmployee) {
        if (Objects.isNull(newEmployee)) {
            return false;
        }
        if (Objects.nonNull(head)) {
            if (this.head.getEmployee().equals(existingEmployee)) {
                EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);
                newEmployeeNode.setNext(this.head);
                this.head = newEmployeeNode;
                size++;
                return true;
            } else {
                EmployeeNode temp = this.head;
                while (Objects.nonNull(temp)) {
                    if (Objects.nonNull(temp.getNext()) && temp.getNext().getEmployee().equals(existingEmployee)) {
                        break;
                    }
                    temp = temp.getNext();
                }
                if (Objects.nonNull(temp)) {
                    return linkNode(newEmployee, temp);
                }
            }
        }
        return false;
    }

    private boolean linkNode(Employee newEmployee, EmployeeNode temp) {
        EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);
        newEmployeeNode.setNext(temp.getNext());
        temp.setNext(newEmployeeNode);
        this.size++;
        return true;
    }

    public void printList() {
        EmployeeNode current = head;
        while (current != null) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public EmployeeNode removeFromFront() {
        if (this.isEmpty())
            return null;
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
