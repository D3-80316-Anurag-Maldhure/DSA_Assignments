package com.bst;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
	
		
		
		
		binarySearchTree.addNode(8);
		binarySearchTree.addNode(3);
		binarySearchTree.addNode(10);
		binarySearchTree.addNode(1);
		binarySearchTree.addNode(6);
		binarySearchTree.addNode(14);
		binarySearchTree.addNode(4);
		binarySearchTree.addNode(7);
		binarySearchTree.addNode(13);
		binarySearchTree.addNode(68);
		
//		        8
//		       / \
//		      3   10
//		     / \    \
//		    1   6    14
//		       / \   / \
//		      4   7 13  68
		
		
		System.out.println("Parent of node 3 	= " + binarySearchTree.getParent(3));
		System.out.println("Parent of node 10 	= " + binarySearchTree.getParent(10));
		System.out.println("Parent of node 1 	= " + binarySearchTree.getParent(1));
		System.out.println("Parent of node 6 	= " + binarySearchTree.getParent(6));
		System.out.println("Parent of node 14 	= " + binarySearchTree.getParent(14));
		System.out.println("Parent of node 4 	= " + binarySearchTree.getParent(4));
		System.out.println("Parent of node 7 	= " + binarySearchTree.getParent(7));
		System.out.println("Parent of node 13 	= " + binarySearchTree.getParent(13));
		System.out.println("Parent of node 68 	= " + binarySearchTree.getParent(68));
		
		binarySearchTree.inorder();
		
	}
}
