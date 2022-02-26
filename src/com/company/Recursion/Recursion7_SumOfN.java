package com.company.Recursion;

public class Recursion7_SumOfN {

    // TC: O(n)
    // Sc: O(n)
    public static int sumOfNRec(int n) {
        if(n==0)return 0;
        else return sumOfNRec(n-1)+n;
    }

    //Tc: O(1)
    //Sc: O(1)
    public static int sumOfN(int n) {
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNRec(5));
    }
}
