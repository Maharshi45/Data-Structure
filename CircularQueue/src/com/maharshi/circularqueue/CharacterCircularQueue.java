package com.maharshi.circularqueue;

import java.util.NoSuchElementException;

public class CharacterCircularQueue {

    private Character[] queue;
    private int front;
    private int back;

    public CharacterCircularQueue(int capacity) {
        queue = new Character[capacity];
    }

    public void add(Character c) {
        if (this.size() == queue.length - 1) {
            int size = this.size();
            Character[] newArray = new Character[queue.length * 2];
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            if (back == front - 1)
                System.arraycopy(queue, 0, newArray, queue.length - front, back);
            front = 0;
            back = size;
            queue = newArray;
        }
        queue[back] = c;
        if (back < queue.length - 1)
            back++;
        else
            back = 0;
    }

    public Character remove() {
        if (this.size() == 0) {
            throw new NoSuchElementException();
        }
        Character c = queue[front];
        queue[front] = null;
        front++;
        if (this.size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }
        return c;
    }

    public Character peek() {
        if (this.size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        if (front <= back)
            return back - front;
        else
            return back - front + queue.length;
    }

    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }

}
