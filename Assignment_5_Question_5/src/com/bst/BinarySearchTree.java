package com.bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


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
	
	//Write recursive function to perform search operation in BST
	public Node binarySearchRecursiveWrapper(int key) {	
		return binarySearchRecursive(key, root);
	}
	
	public Node binarySearchRecursive(int key, Node trav) {	
		//terminating condition
		 if(trav==null) 
			 return null;
		 else if(key == trav.data)
			 return trav;
		 
		 //recursive call
		 if(key < trav.data)
			 return binarySearchRecursive(key, trav.left);
		 else {
			 return binarySearchRecursive(key, trav.right);
		 }		
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
	
	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node newNode = new Node(value);
		
		if(isEmpty())
			root = newNode;
		else {
			Node trav = root;
			
			while(true) {
				if(value<trav.data) {
					if(trav.left == null) {
						trav.left = newNode;
						break;
					}
					else {
						trav = trav.left;
					}
				}
				else {
					if(trav.right == null) {
						trav.right = newNode;
						break;
					}
					else {
						trav = trav.right;
					}
				}
			}
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
	
	public void DFSTraversal() {
		//0. create stack to push nodes of tree
		Stack<Node> st = new Stack<>();
		//1. push root on stack
		st.push(root);
		System.out.print("DFS Traversal : ");
		while(!st.isEmpty()) {
			//2. pop one node from stack
			Node trav = st.pop();
			//3. visit(print) node
			System.out.print(" " + trav.data);
			//4. if right exist, push it on stack
			if(trav.right != null)
				st.push(trav.right);
			//5. if left exist, push it on stack
			if(trav.left != null)
				st.push(trav.left);
		}//6. while stack is not empty repeat step 2 to 5
		System.out.println("");
	}
	
	public void BFSTraversal() {
		//0. create queue to push nodes of tree
		Queue<Node> q = new LinkedList<BinarySearchTree.Node>();
		//1. push root on queue
		q.offer(root);
		System.out.print("BFS Traversal : ");
		while(!q.isEmpty()) {
			//2. pop one node from queue
			Node trav = q.poll();
			//3. visit(print) node
			System.out.print(" " + trav.data);
			//4. if left exist, push it on queue
			if(trav.left != null)
				q.offer(trav.left);
			//5. if right exist, push it on queue
			if(trav.right != null)
				q.offer(trav.right);
		}//6. while queue is not empty repeat step 2 to 5
		System.out.println("");
	}
}
