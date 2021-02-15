package datastructures.linear.stacks.arrays;

import datastructures.linear.stacks.StackADT;

import java.util.ArrayList;

public class ArrayListStack<E> implements StackADT<E> {

    private ArrayList<E> stack;

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
