package com.company.QueueDS;

class Node{
    public int data;
    public Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue3_ImpUsingLinkedList {
    private Node front,rear;

    Queue3_ImpUsingLinkedList() {
        front = rear = null;
    }
    // empty
    public boolean isEmpty() {
        return front==null;
    }
    //enqueue
    public void enqueue(int element) {
        Node t = new Node(element);
        if(t==null) {
            // i.e the heap memory is full and queue is full
            System.out.println("Queue is full");
        }
        if(isEmpty()) {
            // front=null
            front = rear = t;
        } else {
            rear.next = t;
            rear = t;
        }
    }
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            Node t = front;
            front = front.next;
            int x = t.data;
            t = null;
            return x;
        }
    }
    public void display() {
        Node t = front;
        while (t!=null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
}
