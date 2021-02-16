package datastructures.linear.stacks.arrays;

import datastructures.linear.stacks.StackADT;

public class ArrayStack<E> implements StackADT<E> {

    private final int MAX_SIZE;
    private int top;

    public ArrayStack(int size) {
        this.MAX_SIZE = size;
        this.top = -1;
    }

    @Override
    public boolean push(E item) {
        return false;
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
