package com.company.QueueDS;

import java.util.ArrayDeque;

public class Queue5_PriorityQueues {
    public static void main(String[] args) {
        char[]carr = "ABCDEFGHIJ".toCharArray();
        int[]parr = {1,1,2,3,2,1,2,3,2,2};
        priorityQueues(carr,parr);
    }
    public static void priorityQueues(char[]arr,int[]priority_array) {
        // There are 3 priorities so take 3 queue
        ArrayDeque<Character> q1 = new ArrayDeque<>();
        ArrayDeque<Character> q2 = new ArrayDeque<>();
        ArrayDeque<Character> q3 = new ArrayDeque<>();

        // insert from rear = offerLast(e)
        // delete from front = pollFirst(e)

        for(int i=0;i<arr.length;i++) {
            if(priority_array[i]==1) q1.offerLast(arr[i]);
            else if(priority_array[i]==2) q2.offerLast(arr[i]);
            else if(priority_array[i]==3) q3.offerLast(arr[i]);
        }
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }
}
