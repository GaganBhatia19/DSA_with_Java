package com.company.Recursion;

public class Recursion1_StaticVariablesInRecursion {

    static int a = 0; // we can also declare as global variable
    public static int recFunction(int n) {
        if(n>0) {
            a++;
            return recFunction(n-1)+a;
        }
        return 0;
    }

    public static void main(String[]args) {
        System.out.println(recFunction(4));
    }
}
