package datastructures.linear.stacks.lists;

import datastructures.linear.lists.linked.doubly.DoublyLinkedList;
import datastructures.linear.stacks.StackADT;

public class LinkedStack<E> implements StackADT<E> {

    private DoublyLinkedList<E> stack;

    public LinkedStack() {
        this.stack = new DoublyLinkedList<>();
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
