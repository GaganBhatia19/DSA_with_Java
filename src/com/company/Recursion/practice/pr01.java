package com.company.Recursion.practice;

public class pr01 {
    public static void foo(int n,int sum) {
        int k=0,j=0;
        if(n==0) return;
        k = n%10;
        j = n/10;
        sum+=k;
        foo(j,sum);
        System.out.println(k);
    }
    public static void main(String[] args) {
        int sum = 0;
        int n = 2048;
        foo(n,sum);
        System.out.printf("sum is %d",sum);
    }
}
