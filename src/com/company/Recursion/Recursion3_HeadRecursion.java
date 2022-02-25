package com.company.Recursion;

public class Recursion3_HeadRecursion {
    //Time complexity: O(n)
    //Space Complexity: O(n)
    public static void recFunction(int n) {
        if(n>0) {
            recFunction(n-1);
            System.out.println(n);
        }
    }
    public static int recFunction2(int n) {
        if(n>0) {
            return recFunction2(n-1)+n;
        }
        return 0;
    }
    public static void main(String[] args) {
        recFunction(4);
        System.out.println(recFunction2(4));
    }
}
