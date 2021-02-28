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

    /**
     * This method will simply return the data in the root node of the Binary Tree.
     *
     * @return the data in the root node of the current binary tree.
     */
    public E getData() {
        return null;
    }

    /**
     * This method will tell whether the current tree/node is a leaf node.
     *
     * @return true if the current tree/node is a leaf, otherwise false.
     */
    public boolean isLeaf() {
        if (rootNode != null) {
            return rootNode.getLeftChild() == null && rootNode.getRightChild() == null;
        } else return false;
    }
}
