package datastructures.linear.stacks.arrays;

import datastructures.linear.stacks.StackADT;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack<E> implements StackADT<E> {

    private ArrayList<E> stack;

    public ArrayListStack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public boolean push(E item) {
        return stack.add(item);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow!");
        }
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
