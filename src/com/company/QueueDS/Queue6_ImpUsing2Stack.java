package com.company.QueueDS;

import java.util.ArrayDeque;

public class Queue6_ImpUsing2Stack {
    private ArrayDeque<Integer> s1,s2;
    Queue6_ImpUsing2Stack() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }

    public void enqueue(int x) {
        s1.push(x);
    }
    public int dequeue() {
        if(s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            if(s2.isEmpty()) {
                while(!s1.isEmpty()) {
                    int x = s1.pop();
                    s2.push(x);
                }
                return s2.pop();
            } else {
                return s2.pop();
            }
        }
    }
}
