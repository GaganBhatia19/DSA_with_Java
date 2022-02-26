package com.company.Recursion;

public class Recursion10_taylorSeries {
    // TC: O(n^2)
    // Sc: O(n^2)
    static double p=1,f=1,sum=0;
    public static double tseries1(int x,int n) {
        if(n==0) {
            sum+=1;
            return sum;
        }
        else {
            tseries1(x,n-1);
            p*=x;
            f*=n;
            sum+=p/f;
            return sum;
        }
    }
// OR
    public static double tseries2(int x,int n) {
        if(n==0) {
            return 1;
        }
        else {
            sum+=tseries2(x,n-1);
            p*=x;
            f*=n;
            return sum + p/f;
        }
    }

    public static void main(String[] args) {
        System.out.println(tseries1(4,10));
    }
}
