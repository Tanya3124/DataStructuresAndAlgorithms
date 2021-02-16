package datastructures.linear.queues.circular;

import datastructures.linear.queues.arrays.ArrayQueue;

import java.util.NoSuchElementException;

public class CircularQueue<E> extends ArrayQueue<E> {

    private final int MAX_SIZE;
    private final Object[] queue;
    private int front;
    private int rear;

    public CircularQueue(int size) {
        super(size);
        this.MAX_SIZE = size;
        this.front = 0;
        this.rear = -1;
        this.queue = new Object[MAX_SIZE];
    }

    @Override
    public boolean enqueue(E item) {
        if (rear == MAX_SIZE - 1) {
            rear = -1;
        }
        queue[++rear] = item;
        return true;
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        if (front == -1) {
            throw new NoSuchElementException("Queue is empty!");
        }
        if (front == MAX_SIZE) {
            front = 0;
        }
        return (E) queue[front++];
    }
}
