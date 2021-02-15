package datastructures.linear.queues;

import java.util.NoSuchElementException;

public interface QueueADT<E> {

    boolean enqueue(E item);

    E dequeue() throws NoSuchElementException;

}
