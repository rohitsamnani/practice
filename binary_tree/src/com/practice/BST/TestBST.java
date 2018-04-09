package com.practice.BST;

public class TestBST {
	
	public static void main(String[] args) {
		
		BinarySearchTree tree  = new BinarySearchTree();
		tree.insert(210);
	    tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.inorderTraversal();
        System.out.println();
        tree.delete(50);
        tree.inorderTraversal();
	}

}
