package com.bst;


public class BinarySearchTree {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
		public int getData() {
			return data;
		}
	}
	
	private Node root;
	public BinarySearchTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}

	public int getNodeLevel(int targetValue) {
		return getNodeLevelRecursive(root, targetValue, 1);
	}

	    private int getNodeLevelRecursive(Node current, int targetValue, int currentlevel) {
	        if (current == null) {
	            return -1; // Node not found
	        }

	        if (targetValue == current.getData()) {
	            return currentlevel; // Node found, return the current level
	        }

	        if (targetValue < current.getData()) {
	            return getNodeLevelRecursive(current.left, targetValue, currentlevel + 1);
	        } else {
	            return getNodeLevelRecursive(current.right, targetValue, currentlevel + 1);
	        }
	    }
	
	public void addNode(int value) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if tree is empty
		if(isEmpty())
			//a. add newnode into root
			root = newnode;
		//3. if tree is not empty
		else {
			//3.1 create trave and start at root
			Node trav = root;
			while(true) {
				//3.2 if value is less than current node data
				if(value  < trav.data) {
					//3.2.1 if left is empty
					if(trav.left == null) {
						// add newnode into left of current node
						trav.left = newnode;
						break;
					}
					//3.2.2 if left is not empty
					else
						// go into left
						trav = trav.left;
				}
				//3.3 if value is greater than current node data
				else {
					//3.2.1 if right is empty
					if(trav.right == null) {
						// add newnode into right of current node
						trav.right = newnode;
						break;
					}
					//3.2.2 if right is not empty
					else
						// go into right
						trav = trav.right;
				}
			}//3.4 repeat step 3.2 and 3.3 till node is not added into tree
		}
	}
	
	public void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" " + trav.data);//V 
		preorder(trav.left);//L 
		preorder(trav.right);//R
	}
	
	public void preorder() {
		System.out.print("Preorder: ");
		preorder(root);
		System.out.println("");
	}
	
	public void inorder(Node trav) {
		if(trav == null)
			return;
		inorder(trav.left);//L 
		System.out.print(" " + trav.data);//V 
		inorder(trav.right);//R
	}
	
	public void inorder() {
		System.out.print("Inorder: ");
		inorder(root);
		System.out.println("");
	}
	
	public void postorder(Node trav) {
		if(trav == null)
			return;
		postorder(trav.left);//L 
		postorder(trav.right);//R
		System.out.print(" " + trav.data);//V
	}
	
	public void postorder() {
		System.out.print("Postorder: ");
		postorder(root);
		System.out.println("");
	}
	
}

