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

    public BinaryTree(E data, BinaryTree<E> leftSubTree, BinaryTree<E> rightSubTree) {
        this.rootNode = new Node<>(data);
        this.rootNode.setLeftChild(leftSubTree != null ? leftSubTree.rootNode : null);
        this.rootNode.setRightChild(rightSubTree != null ? rightSubTree.rootNode : null);
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

    public BinaryTree<E> getLeftSubTree() {
        if (this.rootNode != null && this.rootNode.getLeftChild() != null) {
            return new BinaryTree<>(this.rootNode.getLeftChild());
        } else {
            return null;
        }
    }

    public BinaryTree<E> getRightSubTree() {
        if (this.rootNode != null && this.rootNode.getRightChild() != null) {
            return new BinaryTree<>(this.rootNode.getRightChild());
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder dataString = new StringBuilder();
        toString(this.rootNode, 1, dataString);
        return dataString.toString();
    }

    private void toString(Node<E> node, int depth, StringBuilder dataString) {
        dataString.append(" ".repeat(Math.max(0, depth - 1)));
        if (node == null) {
            dataString.append("null\n");
        } else {
            dataString.append(node.toString());
            dataString.append("\n");
            toString(this.rootNode.getLeftChild(), depth + 1, dataString);
            toString(this.rootNode.getRightChild(), depth + 1, dataString);
        }
    }
}
