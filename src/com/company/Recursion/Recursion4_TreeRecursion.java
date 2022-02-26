package com.company.Recursion;

public class Recursion4_TreeRecursion {
    // Time complexity: O(2^n)
    // Space complexity: O(n)
    public static void recFunction(int n) {
        if(n>0) {
            System.out.print(n+" ");
            // more than 1 function call
            recFunction(n-1); // calling phase
            recFunction(n-1); // returning phase
        }
    }
    public static void main(String[] args) {
        recFunction(3); // output: 3 2 1 1 2 1 1
    }
}
