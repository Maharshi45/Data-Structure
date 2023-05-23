package com.maharshi.stacks;

import java.util.EmptyStackException;

public class ArrayCharacterStack {

    private Character[] stack;
    private int top;

    public ArrayCharacterStack(int capacity) {
        stack = new Character[capacity];
    }

    public void push(Character character) {
        if (top == stack.length) {
            // need to resize the array
            Character[] newArray = new Character[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = character;
    }

    public Character pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        Character character = stack[--top];
        stack[top] = null;
        return character;
    }

    public Character peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }

}
