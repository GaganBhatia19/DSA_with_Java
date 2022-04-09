package com.company.QueueDS;

public class Queue4_DEQueue {
    private int front,rear;
    public int size;
    private int[] deqarr;

    Queue4_DEQueue(int size) {
        this.size = size;
        deqarr = new int[this.size];
        front = rear = -1;
    }
    // empty
    public boolean isEmpty() {
        return front == rear;
    }
    public boolean isFull() {
        return (rear+1)%size==front;
    }

    public void enqueueRear(int element) {
        if(isFull()) {
            System.out.println("Queue is full");
        } else {
            rear = (rear+1)%size;
            deqarr[rear] = element;
        }
    }
    public void enqueueFront(int element) {
        if(front-1==-1) {
            System.out.println("Queue is full");
        } else {
            deqarr[++front] = element;
        }
    }
    public int dequeueFront() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
//            front--;
            return deqarr[front--];
        }
    }
    public int dequeueRear() {
        if(rear==-1) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return deqarr[rear--];
        }
    }
    public void display() {
        int f = front+1;
        while(f<=rear) {
            System.out.print(deqarr[f] + " ");
            f++;
        }
        System.out.println();
    }
}
