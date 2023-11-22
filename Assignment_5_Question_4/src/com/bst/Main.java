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

//		bst.preorder();
		bst.inorder();
//		bst.postorder();
		
	/*
		BSTree.Node ret =  bst.binarySearch(15);
		if(ret != null)
			System.out.println("Key is found and data = " + ret.getData());
		else
			System.out.println("Key is not found");
		*/
		
//		bst.DFSTraversal();
//		bst.BFSTraversal();
//		
		
		BinarySearchTree bst1 = new BinarySearchTree();
		
		bst1.addNodeRecursiveWrapper(8);
		bst1.addNodeRecursiveWrapper(3);
		bst1.addNodeRecursiveWrapper(10);
		bst1.addNodeRecursiveWrapper(1);
		bst1.addNodeRecursiveWrapper(6);
		bst1.addNodeRecursiveWrapper(14);
		bst1.addNodeRecursiveWrapper(4);
		bst1.addNodeRecursiveWrapper(7);
		bst1.addNodeRecursiveWrapper(13);
		
		bst1.inorder();
	}
}
