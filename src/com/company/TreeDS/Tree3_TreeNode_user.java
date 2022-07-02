package com.company.TreeDS;

import javax.swing.tree.TreeNode;
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
        System.out.println();
        postorder(rootNode);
        System.out.println();
        inorder(rootNode);
    }
    public static void preorder(TreeNodeC node){
        if(node!=null){
            System.out.print(node.data+" ");
            for(int i=0;i<node.children.size();i++){
                preorder((TreeNodeC) node.children.get(i));
            }
        }
    }
    public static void postorder(TreeNodeC node){
        if(node!=null){
            for (int i=0;i<node.children.size();i++)
                postorder((TreeNodeC) node.children.get(i));
            System.out.print(node.data+" ");
        }
    }
    public static void inorder(TreeNodeC node){
        if(node!=null){
            int total = node.children.size();
            // consider all except last
            for (int i=0;i<total-1;i++){
                inorder((TreeNodeC) node.children.get(i));
            }
            System.out.print(node.data+" ");
            // considering the last element
            if(total!=0)
            inorder((TreeNodeC) node.children.get(total-1));
        }
    }
}
/*
* OUTPUT
Enter root node: 4
Enter 0th child of 4: 2
Enter 1th child of 4: 3
Enter 2th child of 4: 5
Enter 3th child of 4: -1
Enter 0th child of 2: -1
Enter 0th child of 3: 6
Enter 1th child of 3: -1
Enter 0th child of 5: -1
Enter 0th child of 6: -1
4 2 3 6 5
2 6 3 5 4
2 3 6 4 5
* */