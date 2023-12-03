package com.bridgelabz.bst;
public class Main {
    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Add nodes to the BST
        bst.addNode(56);
        bst.addNode(30);
        bst.addNode(70);

        // Perform inorder traversal to check the order of nodes
        System.out.println("Inorder Traversal:");
        bst.inorderTraversal();

    }
}