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
		
		
//		binarySearchTree.preorder();
//		binarySearchTree.inorder();
//		binarySearchTree.postorder();
		
		System.out.println("Depth of 8  = " + binarySearchTree.getNodeLevel(8));
		System.out.println("Depth of 10 = " + binarySearchTree.getNodeLevel(10));
		System.out.println("Depth of 6  = " + binarySearchTree.getNodeLevel(6));
		System.out.println("Depth of 68 = " + binarySearchTree.getNodeLevel(68));
		
	}

}
