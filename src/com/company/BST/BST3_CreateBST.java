package com.company.BST;

public class BST3_CreateBST {
    public static void main(String[] args) {
        int[]keys = {9,15,5,20,16,8,12,3,6};
        BST2_InsertingInBST.Node<Integer> root = createBST(keys);
        BST2_InsertingInBST.printTreeInorder(root);
    }
    static BST2_InsertingInBST.Node createBST(int[]keys) {
        BST2_InsertingInBST.Node root = new BST2_InsertingInBST.Node(keys[0]);
        for(int i=1;i<keys.length;++i)
            BST2_InsertingInBST.insertNodeItr(root,keys[i]); // insert
        return root;
    }
}
