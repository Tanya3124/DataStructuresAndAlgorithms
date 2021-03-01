package datastructures.nonlinear.trees.node;

public class Node<E> {
    // data of the tree node
    private E data;

    // reference to the left child node
    private Node<E> leftChild;

    // reference to the right child node
    private Node<E> rightChild;

    public Node(E data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    /**
     * This method will print the node of the Binary Tree.
     * Since the data of the node is already a reference type it must have a toString() method.
     * We will use the same toString() method from the type E to print the data of the tree node.
     *
     * @return The String representation of the data inside the node.
     */
    @Override
    public String toString() {
        return data.toString();
    }

    public Node<E> getLeftChild() {
        return leftChild;
    }

    public Node<E> getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node<E> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node<E> rightChild) {
        this.rightChild = rightChild;
    }

    public E getData() {
        return data;
    }
}
