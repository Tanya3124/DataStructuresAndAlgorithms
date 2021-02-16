package datastructures.linear.queues.arrays;

import datastructures.linear.queues.QueueADT;

import java.util.NoSuchElementException;

public class ArrayQueue<E> implements QueueADT<E> {

    private final int MAX_SIZE;
    private int front;
    private int rear;
    private Object[] queue;

    public ArrayQueue(int size) {
        this.MAX_SIZE = size;
    }

    @Override
    public boolean enqueue(E item) {
        return false;
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        return null;
    }
}
