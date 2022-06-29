package com.company.TreeDS.Revised;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left,right;

    public BinaryTreeNode(T data){
        this.data = data;
        left = right = null;
    }
}

class BinaryTreeNodeUserClass{
    public static void main(String args[]) throws Exception{
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
        // Traversals
        System.out.print("Traverse tree? ");
        int traverseTree = scanner.nextInt();
        while(traverseTree!=0){
            System.out.print("Enter your choice: ");
            /*
             *   0 for preorder
             *   1 for inorder
             *   2 for postorder
             * */
            int chooseTraversal = scanner.nextInt();
            if(chooseTraversal==0){
                preorder(rootNode);
                System.out.println();
            } else if(chooseTraversal==1){
                inorder(rootNode);
                System.out.println();
            } else if(chooseTraversal==2) {
                postorder(rootNode);
                System.out.println();
            }
            System.out.print("Traverse tree? ");
            traverseTree = scanner.nextInt();
        }

    }
    public static void preorder(BinaryTreeNode node){
        if(node!=null){
            System.out.print(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }
    public static void inorder(BinaryTreeNode node){
        if(node!=null){
            inorder(node.left);
            System.out.print(node.data);
            inorder(node.right);
        }
    }
    public static void postorder(BinaryTreeNode node){
        if(node!=null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data);
        }
    }
}

/*
*  OUTPUT
"C:\Program Files\Java\jdk-17.0.2\bin\java.exe" "-javaagent:H:\Softwares\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=49888:H:\Softwares\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath "H:\Development\DSA with Java\out\production\DSA with Java" com.company.TreeDS.Revised.BinaryTreeNodeUserClass
Enter root node: 5
Enter left child of node 5 : 8
Enter right child of node 5 : 6
Enter left child of node 8 : -1
Enter right child of node 8 : -1
Enter left child of node 6 : -1
Enter right child of node 6 : -1
Traverse tree? 1
Enter your choice: 0
586
Traverse tree? 1
Enter your choice: 1
856
Traverse tree? 1
Enter your choice: 2
865
Traverse tree? 0

Process finished with exit code 0
*
* */


