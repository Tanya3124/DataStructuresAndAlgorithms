package datastructures.linear.lists.linked.singly.main;

import datastructures.linear.lists.linked.singly.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(41);
        singlyLinkedList.add(42);
        singlyLinkedList.add(43);
        singlyLinkedList.add(44);
        singlyLinkedList.remove();
        System.out.println(singlyLinkedList);
    }
}
