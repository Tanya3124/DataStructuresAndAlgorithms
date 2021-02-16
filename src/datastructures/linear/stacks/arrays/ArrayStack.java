package datastructures.linear.stacks.arrays;

import datastructures.linear.stacks.StackADT;

public class ArrayStack<E> implements StackADT<E> {

    private final int MAX_SIZE;
    private int top;
    private Object[] stack;

    public ArrayStack(int size) {
        this.MAX_SIZE = size;
        this.top = -1;
        this.stack = new Object[size];
    }

    @Override
    public boolean push(E item) {
        top = top + 1;
        if (top >= MAX_SIZE) {
            throw new IndexOutOfBoundsException("Stack Overflow!");
        }
        stack[top] = item;
        return true;
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
