package com.bridgelabz.bst;
public class Main {
    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Add nodes to the BST
        bst.addNode(56);
        bst.addNode(30);
        bst.addNode(70);
        bst.addNode(22);
        bst.addNode(40);
        bst.addNode(11);
        bst.addNode(3);
        bst.addNode(16);
        bst.addNode(60);
        bst.addNode(95);
        bst.addNode(65);
        bst.addNode(63);
        bst.addNode(67);

        // Perform inorder traversal to check the order of nodes
        System.out.println("Inorder Traversal:");
        bst.inorderTraversal();

        // Check if all elements are added by comparing the size
        int expectedSize = 13;
        if (bst.size() == expectedSize) {
            System.out.println("\nAll elements are added to the binary search tree.");
        } else {
            System.out.println("\nNot all elements are added to the binary search tree.");
        }

        //search element 63
        int searchElement = 63;
        if(bst.searchTree(searchElement))
        {
            System.out.println(searchElement+" found");
        }
        else
            System.out.println(searchElement+" not found");

    }
}