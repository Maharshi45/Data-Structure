package com.maharshi.doublylinkedlists;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (head == null) {
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
        size++;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD ->");
        while (current != null) {
            System.out.print(current + " <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public EmployeeNode removeFromFront() {
        if (this.isEmpty())
            return null;
        EmployeeNode removedNode = head;
        if (head.getNext() == null) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
            removedNode.setNext(null);
        }
        size--;
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {

        if (this.isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = tail;
        if (tail.getPrev() == null) {
            head = null;
            tail = null;
        } else {
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
            removedNode.setPrev(null);
        }
        size--;
        return removedNode;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
