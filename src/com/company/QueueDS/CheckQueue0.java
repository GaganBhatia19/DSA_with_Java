package com.company.QueueDS;

public class CheckQueue0 {
    public static void main(String[] args) {
        /*
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
         */

        /*
        // Circular queue
        Queue2_CircularQueue queue = new Queue2_CircularQueue(5);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.enqueue(12);
        queue.enqueue(23);
        queue.enqueue(34);
        queue.enqueue(45);
        queue.display();
//        queue.enqueue(21);
//        queue.enqueue(68);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.display();
         */

        /*
        // Queue using LinkedList
        Queue3_ImpUsingLinkedList queue = new Queue3_ImpUsingLinkedList();
        queue.enqueue(12);
        queue.enqueue(23);
        queue.enqueue(34);
        queue.enqueue(45);
        queue.enqueue(56);
        queue.display();
        queue.enqueue(782);
        queue.enqueue(234);
        queue.enqueue(74);
        queue.enqueue(2);
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.display();

         */

        /*
        // DEQueue
        Queue4_DEQueue dequeue = new Queue4_DEQueue(5);
        dequeue.enqueueRear(12);
        dequeue.enqueueRear(53);
        dequeue.enqueueRear(35);
        dequeue.display();

        dequeue.enqueueFront(99);
        dequeue.display();

        dequeue.dequeueFront();
        dequeue.display();

        dequeue.dequeueRear();
        dequeue.display();

         */

        // Implementing queue using 2 Stack
        Queue6_ImpUsing2Stack queue = new Queue6_ImpUsing2Stack();
        queue.enqueue(12);
        queue.enqueue(23);
        queue.enqueue(62);
        queue.enqueue(45);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
