package com.company.Recursion.practice;

public class pr02 {
    public static int func(int x,int c) {
        c--;
        if(c==0) return 1;
        x++;
        return func(x,c)*x;
    }
    public static void main(String[] args) {
        System.out.println(func(5,5));
    }
}
