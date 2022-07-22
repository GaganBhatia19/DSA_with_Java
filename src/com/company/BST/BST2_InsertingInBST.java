package com.company.BST;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BST2_InsertingInBST {
    static class Node<T> {
        Node left;
        T data;
        Node right;
        Node(T data) {
            this.data = data;
            left = right = null;
        }
        Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    static void printTreeInorder(Node t) {
        if(t!=null) {
            printTreeInorder(t.left);
            System.out.print(t.data + " ");
            printTreeInorder(t.right);
        }
    }
    public static void main(String[] args) throws Exception{
        // Create Tree
        Node<Integer> n1 = new Node<>(30);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(40);
        Node<Integer> n4 = new Node<>(10);
        Node<Integer> n5 = new Node<>(25);
        Node<Integer> n6 = new Node<>(35);
        Node<Integer> n7 = new Node<>(50);
        n1.left = n2; n1.right = n3;
        n2.left = n4; n2.right = n5;
        n3.left = n6; n3.right = n7;
        printTreeInorder(n1);
        System.out.print("\nEnter element : ");
        int key = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        insertNodeRec(n1, key);
        printTreeInorder(n1);
    }
    static void insertNodeItr(Node<Integer> t,int key) {
        Node<Integer> r = null; // tail pointer
        while (t!=null) {
            r = t;
            if(t.data<key) t = t.right;
            else if(t.data>key) t = t.left;
            else return;// when t.data = key
        }
        Node<Integer> n = new Node<>(key);
        if(r.data<key) r.right = n;
        else r.left = n;
    }
    static Node<Integer> insertNodeRec(Node<Integer> t, int key) {
        if(t==null) {
            t = new Node<>(key);
            return t;
        }
        if(key<t.data) t.left =  insertNodeRec(t.left,key);
        else if(key>t.data) t.right = insertNodeRec(t.right,key);
        return t;
    }
}
