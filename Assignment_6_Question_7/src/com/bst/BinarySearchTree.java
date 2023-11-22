package com.bst;

import java.util.ArrayList;
import java.util.List;


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

	 public void printSiblingPairs() {
	        printSiblingPairsRecursive(root);
	    }

	    private void printSiblingPairsRecursive(Node current) {
	        if (current == null) {
	            return;
	        }

	        Node leftChild = current.left;
	        Node rightChild = current.right;

	        if (leftChild != null && rightChild != null) {
	            System.out.println("Siblings: " + leftChild.getData() + " and " + rightChild.getData());
	        }

	        // Recursively check the left and right subtrees
	        printSiblingPairsRecursive(leftChild);
	        printSiblingPairsRecursive(rightChild);
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
}
