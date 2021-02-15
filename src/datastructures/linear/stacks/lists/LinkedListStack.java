package datastructures.linear.stacks.lists;

import datastructures.linear.stacks.StackADT;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListStack<E> implements StackADT<E> {
    private final LinkedList<E> stack;

    public LinkedListStack() {
        this.stack = new LinkedList<>();
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
        LinkedList<E> copyStack = new LinkedList<>(stack);
        StringBuilder stackString = new StringBuilder();
        for (int i = 0; i < copyStack.size(); i++) {
            E value = copyStack.get(copyStack.size() - i - 1);
            stackString.append(value).append((i < stack.size() - 1) ? "\n" : "");
        }
        return stackString.toString();
    }
}
