package datastructures.nonlinear.trees;

import datastructures.nonlinear.trees.node.Node;

public class BinaryTree<E> {
    // reference variable to store the reference of the root node
    private final Node<E> rootNode;

    public BinaryTree() {
        // create an empty Binary Tree, root is set to null i.e. the root is not present.
        this.rootNode = null;
    }

    public BinaryTree(Node<E> rootNode) {
        this.rootNode = rootNode;
    }

}
