package com.company.TreeDS;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Tree7_Levelorder_traversal {
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
        new Solution().levelorder(rootNode);
    }
    static class Solution{
        public void levelorder(BinaryTreeNode<Integer> nodePtr){
            // here begins
            if(nodePtr!=null){
                System.out.print(nodePtr.data + " ");
                ArrayDeque<BinaryTreeNode<Integer>> queue = new ArrayDeque<>();
                queue.offerLast(nodePtr);
                while (nodePtr!=null || !queue.isEmpty()) {
                    nodePtr = queue.pollFirst();
                    BinaryTreeNode<Integer> leftChild, rightChild;
                    if(nodePtr!=null){
                        if (nodePtr.left != null) {
                            leftChild = nodePtr.left;
                            System.out.print(leftChild.data + " ");
                            queue.offerLast(leftChild);
                        }
                        if (nodePtr.right != null) {
                            rightChild = nodePtr.right;
                            System.out.print(rightChild.data + " ");
                            queue.offerLast(rightChild);
                        }
                    }
                }
            }
        }
    }
}
