package datastructures.linear.stacks.lists;

import datastructures.linear.lists.linked.doubly.DoublyLinkedList;
import datastructures.linear.stacks.StackADT;

import java.util.NoSuchElementException;

public class LinkedStack<E> implements StackADT<E> {

    private DoublyLinkedList<E> stack;
    private int top;

    public LinkedStack() {
        this.top = -1;
        this.stack = new DoublyLinkedList<>();
    }

    @Override
    public boolean push(E item) {
        top++;
        return stack.add(item);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow!");
        }
        return stack.remove(top--);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow!");
        }
        return stack.getNode(top).getData();
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
