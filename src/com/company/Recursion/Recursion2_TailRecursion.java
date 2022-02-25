package com.company.Recursion;

public class Recursion2_TailRecursion {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void recFunction(int n) {
        if(n>0) {
            System.out.println(n);
            //code
            recFunction(n-1); // for tail recursion no instruction should be written in this block after this call..otherwise its not tail recursion
        }
    }

    public static void main(String[] args) {
        recFunction(4);
    }
}
