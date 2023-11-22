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
		
		
		
		
		System.out.println("Childrens of node 8 	= " + binarySearchTree.getChildren(8));
		System.out.println("Childrens of node 3		= " + binarySearchTree.getChildren(3));
		System.out.println("Childrens of node 10 	= " + binarySearchTree.getChildren(10));
		System.out.println("Childrens of node 1 	= " + binarySearchTree.getChildren(1));
		System.out.println("Childrens of node 6 	= " + binarySearchTree.getChildren(6));
		System.out.println("Childrens of node 14 	= " + binarySearchTree.getChildren(14));
		System.out.println("Childrens of node 4 	= " + binarySearchTree.getChildren(4));
		System.out.println("Childrens of node 7 	= " + binarySearchTree.getChildren(7));
		System.out.println("Childrens of node 13 	= " + binarySearchTree.getChildren(13));
		System.out.println("Childrens of node 68 	= " + binarySearchTree.getChildren(68));
		
		binarySearchTree.inorder();
		
	}
}
