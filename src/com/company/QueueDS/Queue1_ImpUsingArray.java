package com.company.QueueDS;

public class Queue1_ImpUsingArray {
    // int type queue
    public final int size;
    private int front;
    private int rear;
    private final int []qarr;
    Queue1_ImpUsingArray(int size) {
        this.size = size;
        qarr = new int[size];
        front = rear = -1;
    }
    // check if it's empty
    public boolean isEmpty() {
        return front==rear;
    }

    public boolean isFull() {
        return rear==size-1;
    }

    public void enqueue(int element) {
        if(!isFull()) {
            qarr[++rear] = element;
        } else {
            System.out.println("Queue is full");
        }
    }
    public int dequeue() {
        if(!isEmpty()) {
            front++;
            int res = qarr[front];
//            qarr[front] = null;
            return res;
        } else {
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public void display() {
        for(int i=front+1;i<=rear;i++)
            System.out.print(qarr[i]+" ");
        System.out.println();
    }
}
