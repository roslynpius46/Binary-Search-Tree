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
     * @return root
     */
    private INode<T> addNodeRecursive(INode<T> node, T key) {
        if (node == null) {
            return new BinaryNode<>(key);
        }

        // Compare the key and decide whether to go left or right
        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(addNodeRecursive(node.getLeft(), key));
        }
        else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(addNodeRecursive(node.getRight(), key));
        }

        return node;
    }

    /**
     * @desc calculated size of binary tree
     * @param node root node
     * @return size of binary search tree
     */
    private int size(INode<T> node)
    {
        if(node==null)
            return 0;

        return 1+size(node.getLeft())+size(node.getRight());
    }

    /**
     * @desc Gets the size of the binary search tree.
     * @return The size of the binary search tree.
     */
    public int size()
    {
        return size(root);
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

    /**
     * @desc Search for an element
     * @param node current node during traversal
     * @param key key to be searched
     * @return True - element found, False- element not found
     */
    private boolean searchTree(INode<T>node,T key)
    {
        if(node == null)
            return false;

        else if(key.compareTo(node.getKey()) == 0)
            return true;

        else if(key.compareTo(node.getKey()) > 0)
            return searchTree(node.getRight(),key);
        
        else
            return searchTree(node.getLeft(),key);
    }

    /**
     * @desc Search for an element
     * @param searchKey key to be searched
     * @return True - element found, False- element not found
     */
    public boolean searchTree(T searchKey)
    {
        return searchTree(root,searchKey);
    }
}