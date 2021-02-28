package datastructures.nonlinear.trees.node;

public class Node<E> {
    // data of the tree node
    private final E data;

    // reference to the left child node
    private final Node<E> leftChild;

    // reference to the right child node
    private final Node<E> rightChild;

    public Node(E data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
