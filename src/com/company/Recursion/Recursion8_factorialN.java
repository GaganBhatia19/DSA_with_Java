package com.company.Recursion;

public class Recursion8_factorialN {
    // TC: O(n)
    // Sc: O(n)
    public static int factorialN(int n) {
        if(n==0) return 1;
        else return factorialN(n-1)*n;
    }
    public static void main(String[] args) {
        System.out.println(factorialN(5));
    }
}
