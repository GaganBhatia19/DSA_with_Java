package com.company.Recursion;

public class Recursion5_IndirectRecursion {
    public static void recFunction1(int n) {
        if(n>0) {
            System.out.print(n+" ");
            recFunction2(n-1); // calling function2
        }
    }
    public static void recFunction2(int n) {
        if(n>0) {
            System.out.print(n+" ");
            recFunction1(n/2);// calling function1
        }
    }
//    Time Complexity(for this eg): log(n)
    public static void main(String[]args) {
        recFunction1(20);
    }
}
