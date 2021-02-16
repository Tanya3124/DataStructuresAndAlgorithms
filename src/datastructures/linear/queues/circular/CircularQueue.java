package datastructures.linear.queues.circular;

import datastructures.linear.queues.arrays.ArrayQueue;

import java.util.NoSuchElementException;

public class CircularQueue<E> extends ArrayQueue<E> {

    private final int front;
    private final int rear;

    public CircularQueue(int size) {
        super(size);
        this.front = 0;
        this.rear = -1;
    }

    @Override
    public boolean enqueue(E item) {
        return super.enqueue(item);
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        return super.dequeue();
    }
}
