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
        return stack.remove(stack.size() - 1);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow!");
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        ArrayList<E> copyStack = new ArrayList<>(stack);
        StringBuilder stackString = new StringBuilder();
        for (int i = 0; i < copyStack.size(); i++) {
            E value = copyStack.get(copyStack.size() - i - 1);
            stackString.append(value).append((i < stack.size() - 1) ? "\n" : "");
        }
        return stackString.toString();
    }
}