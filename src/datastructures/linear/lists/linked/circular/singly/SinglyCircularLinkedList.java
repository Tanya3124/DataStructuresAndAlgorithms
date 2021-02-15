package datastructures.linear.lists.linked.circular.singly;

import datastructures.linear.lists.ListADT;
import datastructures.linear.lists.linked.singly.SinglyLinkedList;
import datastructures.linear.lists.linked.singly.node.Node;

public class SinglyCircularLinkedList<E> implements ListADT<E> {

    private SinglyLinkedList<E> singlyLinkedList;
    private Node<E> tail;

    public SinglyCircularLinkedList() {
        this.singlyLinkedList = new SinglyLinkedList<>();
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
