package com.circularqueue;

// Question - Implement circular queue using counter method
public class CircularQueue {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    //The count variable in the circular queue implementation is used to keep track of the number of elements 
    //currently present in the queue. It provides a convenient way to check whether the queue is empty or full 
    //and helps in managing the circular nature of the queue.
    private int count;

    public CircularQueue(int size) {
        this.size = size;
        this.array = new int[size];
        this.front = -1;
        this.rear = -1;
        this.count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        rear = (rear + 1) % size;
        array[rear] = value;

        if (front == -1) {
            front = rear;
        }

        count++;
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int removedValue = array[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        count--;
        System.out.println("Dequeued: " + removedValue);
        return removedValue;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Nothing to show ! Queue is empty.");
            return;
        }

        System.out.print("Circular Queue: ");
        int i = front;
        do {
            System.out.print(array[i] + " ");
            i = (i + 1) % size;
        } while (i != (rear + 1) % size);
        System.out.println();
    }
}
