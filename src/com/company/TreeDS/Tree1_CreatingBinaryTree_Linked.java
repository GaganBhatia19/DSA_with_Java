package com.company.TreeDS;

import java.util.ArrayDeque;
import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> leftChild = null,
            rightChild = null;
}

public class Tree1_CreatingBinaryTree_Linked {

    public static void main(String[] args) {
//        int[]arr = {-1,5,8,6,-1,9,3,-1,-1,-1,4,2};

        Node<Integer> ptr,temp;
        ArrayDeque<Node<Integer>> queue = new ArrayDeque<>(); // offerLast and pollFirst
        Scanner scanner = new Scanner(System.in);
        Node<Integer> root = new Node<>();
        System.out.print("Enter root node: ");
        root.data = scanner.nextInt();
        queue.offerLast(root);

        while (!queue.isEmpty()){
            ptr = queue.pollFirst();
            System.out.printf("Enter Left child of %d: ",ptr.data);
            int lc = scanner.nextInt();// left child's data
            if(lc!=-1) {
                temp = new Node<>();
                temp.data = lc;
                ptr.leftChild = temp;
                queue.offerLast(temp);
            }
            System.out.printf("Enter Right child of %d: ",ptr.data);
            int rc = scanner.nextInt();// right child's data
            if(rc!=-1) {
                temp = new Node<>();
                temp.data = rc;
                ptr.rightChild = temp;
                queue.offerLast(temp);
            }
        }
    }
}
