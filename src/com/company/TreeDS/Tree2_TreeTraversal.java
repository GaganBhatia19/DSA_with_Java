package com.company.TreeDS;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Tree2_TreeTraversal {
    public static Node<Integer> createTree() {
        Node<Integer> ptr,temp,root;
        Scanner scanner = new Scanner(System.in);
        root = new Node<>();
        System.out.print("Enter root node: ");
        root.data = scanner.nextInt();
        ArrayDeque<Node<Integer>> queue = new ArrayDeque<>();
        queue.offerLast(root);

        while (!queue.isEmpty()) {
            ptr = queue.pollFirst();
            System.out.printf("Enter left child of %d: ",ptr.data);
            int lc = scanner.nextInt();
            if(lc!=-1){
                temp = new Node<>();
                temp.data = lc;
                ptr.leftChild = temp;
                queue.offerLast(temp);
            }
            System.out.printf("Enter right child of %d: ",ptr.data);
            int rc = scanner.nextInt();
            if(rc!=-1){
                temp = new Node<>();
                temp.data = rc;
                ptr.rightChild = temp;
                queue.offerLast(temp);
            }
        }

        return root;
    }

    public static void preorder(Node<Integer> root) {
        if(root!=null) {
        // visit
            System.out.print(root.data+" ");
        // preorder(left subtree)
            preorder(root.leftChild);
        // preorder(right subtree)
            preorder(root.rightChild);
        }
    }

    public static void inorder(Node<Integer> root) {
        if(root!=null){
            inorder(root.leftChild);
            System.out.print(root.data+" ");
            inorder(root.rightChild);
        }
    }

    public static void postorder(Node<Integer> root) {
        if(root!=null) {
            postorder(root.leftChild);
            postorder(root.rightChild);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = createTree();
        System.out.println("Preorder traversal");
        preorder(root);
        System.out.println("\nInorder traversal");
        inorder(root);
        System.out.println("\nPostorder traversal");
        postorder(root);
    }
}
