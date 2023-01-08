package com.maharshi.linkedlists;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
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
