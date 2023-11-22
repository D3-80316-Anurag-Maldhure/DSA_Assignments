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
	
	
	//RECURSIVE - Write recursive function to add node into BST
	public void addNodeRecursiveWrapper(int value) {
		Node newNode = new Node(value);
		//If tree is empty
		if(isEmpty())
			root = newNode;
		//call recursively to add
		else{
			addNodeRecursive(newNode, root);
		}
	}
	
	public void addNodeRecursive(Node newNode, Node trav) {
		//terminating condition
		if(trav.left==null) {
			trav.left = newNode;
			return;
		}
		else if(trav.right==null) {
			trav.right = newNode;
			return;
		}
		
		//recursive function
		if(newNode.getData()<trav.data) {
			addNodeRecursive(newNode, trav.left);
		}
		
		if(newNode.getData()>=trav.data) {
			addNodeRecursive(newNode, trav.right);
		}
//		
//		---------- OR --------------------
//		if(newNode.getData()<trav.getData())
//		{
//			if(trav.left==null) {
//				trav.left = newNode;
//				return;
//			}
//			else {
//				addNodeRecursive(newNode, trav.left);
//			}
//		}
//		else {
//			if(trav.right==null) {
//				trav.right = newNode;
//				return;
//			}
//			else {
//				addNodeRecursive(newNode, trav.right);
//			}
//		}
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
