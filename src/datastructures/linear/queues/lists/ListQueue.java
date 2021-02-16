package datastructures.linear.queues.lists;

import datastructures.linear.queues.QueueADT;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ListQueue<E> implements QueueADT<E> {

    private LinkedList<E> queue;

    public ListQueue() {
        this.queue = new LinkedList<>();
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
