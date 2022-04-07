package com.company.QueueDS;

public class CheckQueue0 {
    public static void main(String[] args) {
        Queue1_ImpUsingArray queue = new Queue1_ImpUsingArray(5);
        queue.enqueue(12);
        queue.enqueue(23);
        queue.enqueue(34);
        queue.enqueue(45);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.enqueue(81);
        queue.display();
        queue.enqueue(3242);
        queue.display();
    }
}
