package com.bridgelabz.bst;

/**
 * @desc BinarySearchTree class representing a binary search tree.
 * @param <T> The type of key that the tree nodes hold, extending Comparable.
 */
class BinarySearchTree<T extends Comparable<T>> {
    private INode<T> root;

    /**
     * @desc Constructor to create an empty BinarySearchTree.
     */
    public BinarySearchTree() {
        this.root = null;
    }

    /**
     * @desc Adds a node with the given key to the binary search tree.
     * @param key The key to be added to the tree.
     */
    public void addNode(T key) {
        root = addNodeRecursive(root, key);
    }

    /**
     *
     * @param node The current node to be added
     * @param key The key added to the tree.
     * @return Newly added node
     */
    private INode<T> addNodeRecursive(INode<T> node, T key) {
        if (node == null) {
            return new BinaryNode<>(key);
        }

        // Compare the key and decide whether to go left or right
        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(addNodeRecursive(node.getLeft(), key));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(addNodeRecursive(node.getRight(), key));
        }

        return node;
    }


    /**
     * @desc Performs an inorder traversal of the binary search tree.
     * @param node The current node during traversal.
     */
    public void inorderTraversal(INode<T> node) {
        if (node != null) {
            inorderTraversal(node.getLeft());
            System.out.print(node.getKey() + " ");
            inorderTraversal(node.getRight());
        }
    }

    /**
     * @desc Initiates an inorder traversal of the binary search tree starting from the root.
     */
    public void inorderTraversal() {
        inorderTraversal(root);
    }
}