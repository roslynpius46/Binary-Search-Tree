package com.bridgelabz.bst;

/**
 * @desc Interface representing a node in a binary tree.
 * @param <T> The type of key that the node holds, extending Comparable.
 */
interface INode<T extends Comparable<T>> {
    T getKey(); // Returns the key of the node.
    INode<T> getLeft(); // Returns the left child node.
    INode<T> getRight(); // Returns the right child node.
    void setLeft(INode<T> left); // Sets the left child of the node.
    void setRight(INode<T> right); // Sets the right child of the node.
}