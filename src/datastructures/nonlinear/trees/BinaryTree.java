package datastructures.nonlinear.trees;

import datastructures.nonlinear.trees.node.Node;

public class BinaryTree<E> {
    // reference variable to store the reference of the root node
    private Node<E> root;

    public BinaryTree() {
        // create an empty Binary Tree, root is set to null i.e. the root is not present.
        this.root = null;
    }
}
