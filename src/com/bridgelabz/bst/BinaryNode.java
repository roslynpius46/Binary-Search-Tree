package com.bridgelabz.bst;

/**
 * @desc Implementation of the INode interface representing a binary tree node.
 * @param <T> The type of key that the node holds, extending Comparable.
 */
class BinaryNode<T extends Comparable<T>> implements INode<T> {
    private T key;
    private INode<T> left;
    private INode<T> right;

    /**
     * @desc Constructor to create a BinaryNode with a given key.
     * @param key The key associated with the node.
     */
    public BinaryNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public INode<T> getLeft() {
        return left;
    }

    @Override
    public INode<T> getRight() {
        return right;
    }

    @Override
    public void setLeft(INode<T> left) {
        this.left = left;
    }

    @Override
    public void setRight(INode<T> right) {
        this.right = right;
    }
}
