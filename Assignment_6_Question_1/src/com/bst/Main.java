package com.bst;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		binarySearchTree.preorder();
		
//		Pre-order:  8 3 1 6 4 7 10 14 13 68
		
		binarySearchTree.deleteNode(8);
				
		//        7
		//       / \
		//      3   10
		//     / \    \
		//    1   6    14
		//       / \   / \
		//      4   8 13  68
				
		//      7
		//     / \
		//    3   10
		//   / \    \
		//  1   6    14
		//     /     / \
		//    4     13  68
		
		binarySearchTree.preorder();
		
		//Pre-order:  7 3 1 6 4 10 14 13 68

	}

}
