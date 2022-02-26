package com.company.Recursion;

public class Recursion11_taylorSeriesHornerRule {
    // Tc: O(log n)
    // Sc: O(log n)
    static double res=1;
    public static double tseries(int x,int n) {
        if(n==0) return res;
        else {
            res = (1+ x*res/n);
            return tseries(x,n-1);
        }
    }
    public static void main(String[]args) {
        System.out.println(tseries(4,10));
    }
}
