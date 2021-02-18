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
        this.front = 0;
        this.rear = -1;
        this.queue = new Object[MAX_SIZE];
    }

    @Override
    public boolean enqueue(E item) {
        if (rear == MAX_SIZE) {
            System.err.println("Queue is full! Please wait for some item to be deleted!");
            return false;
        }
        queue[++rear] = item;
        return true;
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        if (front == 0) {
            throw new NoSuchElementException("The Queue is empty!");
        }
        return (E) queue[front++];
    }

    @Override
    public boolean offer(E item) {
        return false;
    }

    @Override
    public E remove() throws NoSuchElementException {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E element() throws NoSuchElementException {
        return null;
    }
}
