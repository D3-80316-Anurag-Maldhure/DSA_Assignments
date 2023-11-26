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
	
	public void deleteNode(int key) {
		//1. search node with its parent to be deleted
		Node arr[] = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		
		//2. if key is not found
		if(temp == null)
			return;
		
		//3. check if node has 2 childs
		if(temp.left != null && temp.right != null){
			//1. find predecessor with its parent
			Node pred = temp.left;
			parent = temp;
			while(pred.right != null){
				parent = pred;
				pred = pred.right;	
			}
			//2. replace data of temp by data of pred
			temp.data = pred.data;
			//3. mark pred for deletion
			temp = pred;
		}
		//4. check if node has right child (1 child)
		if(temp.left == null){
			if(temp == root)		// root node
				root = temp.right;
			else if(temp == parent.left)		// parent's left child
				parent.left = temp.right;
			else	// if(temp == parent.right)	// parent's right child
				parent.right = temp.right;
		}
		//5. check if node has left child (1 child)
		else { //if(temp.right == null)
			if(temp == root)			// root node
				root = temp.left;
			else if(temp == parent.left)		// parent's left child
				parent.left = temp.left;
			else	// if(temp == parent.right)	// parent's right child
				parent.right = temp.left;
		}
	}
	
	public Node[] binarySearchWithParent(int key) {
		//1. start from root
		Node trav = root;
		Node parent = null;
		while(trav != null) {
			//2. if key is equal to current data
			if(key == trav.data)
				//return current node
				break;
			parent = trav;
			//3. if key is less than current data
			if(key < trav.data)
				// search key into left of current node
				trav = trav.left;
			//4. if key is greater than current data
			else
				// search key into right of current node
				trav = trav.right;
		}//5. repeat step 2 to 4 till leaf nodes 
		if(trav == null)
			parent = null;
		return new Node[]{trav, parent};
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
	
	public Node binarySearch(int key) {
		//1. start from root
		Node trav = root;
		while(trav != null) {
			//2. if key is equal to current data
			if(key == trav.data)
				//return current node
				return trav;
			//3. if key is less than current data
			else if(key < trav.data)
				// search key into left of current node
				trav = trav.left;
			//4. if key is greater than current data
			else
				// search key into right of current node
				trav = trav.right;
		}//5. repeat step 2 to 4 till leaf nodes 
		//6. key is not found
		return null;
	}
}