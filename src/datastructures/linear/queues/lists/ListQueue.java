package datastructures.linear.queues.lists;

import datastructures.linear.queues.QueueADT;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ListQueue<E> implements QueueADT<E> {

    private LinkedList<E> queue;
    private int top = 0;
    private int rear = -1;

    public ListQueue() {
        this.queue = new LinkedList<>();
    }

    @Override
    public boolean enqueue(E item) {
        queue.addLast(item);
        rear++;
        return true;
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        return null;
    }
}
