package com.company.Recursion;

public class Recursion6_NestedRecursion {
    public static int recFunction(int n) {
        if(n>100) return n-10;
        else return recFunction(recFunction(n+11));
    }

    public static void main(String[] args) {
        System.out.println(recFunction(95));
    }
}
