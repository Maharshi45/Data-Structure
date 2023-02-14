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

    public boolean addAfter(Employee existingEmployee, Employee newEmployee) {
        if (head != null) {
            EmployeeNode tempHead = head;
            EmployeeNode temp = null;
            while (tempHead != null) {
                if (tempHead.getNext() != null && tempHead.getNext().getEmployee().equals(existingEmployee)) {
                    temp = tempHead.getNext();
                    break;
                }
                tempHead = tempHead.getNext();
            }
            if (temp != null) {
                EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);
                EmployeeNode tempNext = temp.getNext();
                temp.setNext(newEmployeeNode);
                newEmployeeNode.setNext(tempNext);
                size++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean addBefore(Employee existingEmployee, Employee newEmployee) {
        if (head != null) {
            EmployeeNode tempHead = head;
            EmployeeNode temp = null;
            while (tempHead != null) {
                if (tempHead.getNext() != null && tempHead.getNext().getEmployee().equals(existingEmployee)) {
                    temp = tempHead;
                    break;
                }
                tempHead = tempHead.getNext();
            }
            if (temp != null) {
                EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);
                EmployeeNode tempNext = temp.getNext();
                temp.setNext(newEmployeeNode);
                newEmployeeNode.setNext(tempNext);
                size++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
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
