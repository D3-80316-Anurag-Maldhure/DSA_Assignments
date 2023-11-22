package com.bst;

public class Main {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(1);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(13);
		
		bst.preorder();
		bst.inorder();
		bst.postorder();
		
		
		//Using Iterative approach
		BinarySearchTree.Node ret =  bst.binarySearch(18);
		if(ret != null)
			System.out.println("Key is found and data = " + ret.getData());
		else
			System.out.println("Key is not found");
		
		
		//Using Recursive Approach
		BinarySearchTree.Node retR =  bst.binarySearchRecursiveWrapper(13);
		if(retR != null)
			System.out.println("Key is found and data = " + retR.getData());
		else
			System.out.println("Key is not found");
	}
}