package com.company.TreeDS;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Tree4_Iterative_Preorder_traversal {
    static class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left,right;

        public BinaryTreeNode(T data){
            this.data = data;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        ArrayDeque<BinaryTreeNode<Integer>> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter root node: ");
        int rootData = scanner.nextInt();
        BinaryTreeNode<Integer> rootNode = new BinaryTreeNode<>(rootData);
        deque.offerLast(rootNode); // enqueuing root element reference to queue from tail
        // check if queue is empty
        while(!deque.isEmpty()){
            BinaryTreeNode<Integer> nodeFromQueue = deque.pollFirst(); //take out element from head
            System.out.print("Enter left child of node "+nodeFromQueue.data+" : ");
            int leftData = scanner.nextInt();
            if(leftData!=-1){ // if it's -1 then don't take it further
                BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(leftData);
                nodeFromQueue.left = leftNode; // address to leftnode filling in the element which we have taken out form queue
                deque.offerLast(leftNode);// adding the particular address of node to the queue
            }

            System.out.print("Enter right child of node "+nodeFromQueue.data+" : ");
            int rightData = scanner.nextInt();
            if(rightData!=-1){
                BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(rightData);
                nodeFromQueue.right = rightNode;
                deque.offerLast(rightNode);
            }
        }
        new Solution().iterativePreorder(rootNode);
    }
    static class Solution{
        public void iterativePreorder(BinaryTreeNode<Integer> root){
            // here begins
            ArrayDeque<BinaryTreeNode<Integer>> stack = new ArrayDeque<>();
            while(root!=null || !stack.isEmpty()){
                if(root!=null){
                    System.out.print(root.data+" ");
                    stack.push(root);
                    root = root.left;
                } else {
                    root = stack.pop();
                    root = root.right;
                }
            }
        }
    }
}
/*
OUTPUT
Enter root node: 8
Enter left child of node 8 : 3
Enter right child of node 8 : 5
Enter left child of node 3 : -1
Enter right child of node 3 : -1
Enter left child of node 5 : -1
Enter right child of node 5 : -1
8 3 5
Process finished with exit code 0

* */