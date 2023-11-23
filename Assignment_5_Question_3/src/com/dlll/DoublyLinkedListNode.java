package com.dlll;

public class DoublyLinkedListNode {

 int data;
 DoublyLinkedListNode next;
 DoublyLinkedListNode prev;

 public DoublyLinkedListNode(int data) {
     this.data = data;
     this.next = null;
     this.prev = null;
 }
}

//DoublyLinkedList class represents the doubly linked list with head and tail
class DoublyLinkedList {
 DoublyLinkedListNode head;
 DoublyLinkedListNode tail;

 public void addToFront(int data) {
     DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
     if (head == null) {
         head = tail = newNode;
     } else {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
     }
 }

 public void addToRear(int data) {
     DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
     if (tail == null) {
         head = tail = newNode;
     } else {
         newNode.prev = tail;
         tail.next = newNode;
         tail = newNode;
     }
 }

 public int removeFromFront() {
     if (head == null) {
         throw new IllegalStateException("Deque is empty");
     }

     int removedData = head.data;
     head = head.next;

     if (head != null) {
         head.prev = null;
     } else {
         tail = null; // Deque is now empty
     }

     return removedData;
 }

 public int removeFromRear() {
     if (tail == null) {
         throw new IllegalStateException("Deque is empty");
     }

     int removedData = tail.data;
     tail = tail.prev;

     if (tail != null) {
         tail.next = null;
     } else {
         head = null; // Deque is now empty
     }

     return removedData;
 }

 public void display() {
     DoublyLinkedListNode current = head;
     while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;
     }
     System.out.println();
 }
}

