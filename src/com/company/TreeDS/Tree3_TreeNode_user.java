package com.company.TreeDS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

class TreeNodeC<T>{
    T data;
    // to store address of more than 2 nodes
    ArrayList<TreeNodeC<T>> children;

    TreeNodeC(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

public class Tree3_TreeNode_user {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter root node: ");
        int rootData = scanner.nextInt();
        TreeNodeC<Integer> rootNode = new TreeNodeC<>(rootData);
        ArrayDeque<TreeNodeC<Integer>> queue = new ArrayDeque<>();
        queue.offerLast(rootNode);
        // repetitive task
        while(!queue.isEmpty()){
            int i = 0;
            TreeNodeC<Integer> nodeFromQueue = queue.pollFirst();
            System.out.printf("Enter %dth child of %d: ",i,nodeFromQueue.data);
            int childData = scanner.nextInt();
            while(childData!=-1){
                TreeNodeC<Integer> child = new TreeNodeC<>(childData);
                nodeFromQueue.children.add(child);
                queue.offerLast(child);
                System.out.printf("Enter %dth child of %d: ",++i,nodeFromQueue.data);
                childData = scanner.nextInt();
            }
        }
        preorder(rootNode);
    }
    public static void preorder(TreeNodeC node){
        if(node!=null){
            System.out.print(node.data+" ");
            for(int i=0;i<node.children.size();i++){
                preorder((TreeNodeC) node.children.get(i));
            }
        }
    }
}
