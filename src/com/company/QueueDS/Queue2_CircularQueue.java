package com.company.QueueDS;

public class Queue2_CircularQueue {
    public int size;
    private int front;
    private int rear;
    private int[]qarr;

    Queue2_CircularQueue(int size) {
        this.size = size;
        front = rear = -1;
        qarr = new int[this.size];
    }

    public boolean isFull() {
        return (rear+1)%size == front;
    }
    public boolean isEmpty() {
        return rear == front;
    }

    public void enqueue(int num) {
        if(isFull()) {
            System.out.println("Queue is full");
        } else {
            rear = (rear+1)%size;
            qarr[rear] = num;
        }
    }
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            front = (front+1)%size;
            int result = qarr[front];
//            qarr[front] = null;
            return result;
        }
    }

    public int peekFront() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return qarr[front];
        }
    }
    public int peekRear() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return qarr[rear];
        }
    }

    public void display() {
        int f,r;
        f = front + 1;
        r = rear;

        while(f%size != r+1) {
            System.out.print(qarr[f]+" ");
            f++;
        }
        System.out.println();
    }
}
