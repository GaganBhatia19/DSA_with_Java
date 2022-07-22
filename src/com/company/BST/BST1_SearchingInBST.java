package com.company.BST;
import java.io.*;
public class BST1_SearchingInBST {
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
        //printTreeInorder(n1);
        System.out.print("Type the element you want to Search for: ");
        int key = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        Node<Integer> result = Isearch(n1,key);
        if(result!=null) System.out.println("Yes");
        else System.out.println("No");
    }
    static Node<Integer> Rsearch(Node<Integer> t, int key) {
        if(t==null) return t;
        else {
            if(t.data<key) return Rsearch(t.right,key);
            else if(t.data>key) return Rsearch(t.left,key);
            return t; // when t.data = key
        }
    }
    static Node<Integer> Isearch(Node<Integer> t, int key) {
        while(t!=null) {
            if(t.data<key) t = t.right;
            else if(t.data>key) t = t.left;
            else return t;
        }
        return null;
    }
}
