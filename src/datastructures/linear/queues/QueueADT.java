package datastructures.linear.queues;

import java.util.NoSuchElementException;

public interface QueueADT<E> {

    boolean enqueue(E item);

    E dequeue() throws NoSuchElementException;

    /**
     * This method inserts item at the rear of the queue. Returns true if successful; returns false if the item
     * could not be inserted.
     *
     * @param item The item to be inserted.
     * @return true if the item is inserted otherwise, false.
     */
    boolean offer(E item);

    /**
     * This method removes the entry at the front of the queue and returns it if the queue is not empty. If the
     * queue is empty, throws a NoSuchElementException.
     *
     * @return returns the element at the front, if queue is empty then it will throw a NoSuchElementException.
     * @throws NoSuchElementException if the queue is not empty.
     */
    E remove() throws NoSuchElementException;

    /**
     * This method removes the entry at the front of the queue and returns it; returns null if the queue is
     * empty.
     *
     * @return element at the front of the queue, if the queue is empty then null.
     */
    E poll();

    /**
     * This method returns the entry at the front of the queue without removing it; returns null if the queue
     * is empty.
     *
     * @return element at the front of the queue withouth removing it, otherwise null.
     */
    E peek();

    /**
     * This method returns the entry at the front of the queue without removing it. If the queue is empty,
     * throws a NoSuchElementException.
     *
     * @return entry at the front without removing it, if queue is empty then throws a NoSuchElementException.
     * @throws NoSuchElementException if the queue is empty.
     */
    E element() throws NoSuchElementException;
}
