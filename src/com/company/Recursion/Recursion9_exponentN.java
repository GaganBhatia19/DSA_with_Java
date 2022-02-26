package com.company.Recursion;

public class Recursion9_exponentN {
    // TC: O(n)
    // Sc: O(n)
    public static int expN(int m,int n) {
        if(n==0) return 1;
        else return expN(m,n-1)*m;
    }

    // TC: O(log n)
    // Sc: O(log n)
    public static int expoN(int m,int n) {
        if(n==0) return 1;
        else if(n%2==0) return expoN(m*m,n/2);
        else return m*expoN(m*m,(n-1)/2);
    }
    public static void main(String[] args) {
        System.out.println(expN(2,9));
        System.out.println(expoN(2,9));
    }
}
