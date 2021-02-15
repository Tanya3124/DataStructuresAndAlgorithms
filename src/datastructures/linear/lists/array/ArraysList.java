package datastructures.linear.lists.array;

import datastructures.linear.lists.ListADT;

public class ArraysList<E extends Integer> implements ListADT<E> {

    private final int MAX_SIZE;
    private final Integer[] array;
    private final int currentSize;
    private int head;

    public ArraysList(int maxSize) {
        this.MAX_SIZE = maxSize;
        this.array = new Integer[maxSize];
        this.currentSize = 0;
        this.head = -1;
    }

    @Override
    public boolean add(E item) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        return null;
    }
}
