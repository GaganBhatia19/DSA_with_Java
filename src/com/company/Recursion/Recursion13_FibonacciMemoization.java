package com.company.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Recursion13_FibonacciMemoization {
    // TC: O(n)

    static int[]memoArr; // memoization array

    public static int fib(int n) {
        if(n<=1) {
            memoArr[n] = n;
            return memoArr[n];
        }
        else {
            if(memoArr[n-1]==-1)
                memoArr[n-1] = fib(n-1);
            if(memoArr[n-2]==-1)
                memoArr[n-2] = fib(n-2);

            return memoArr[n-1] + memoArr[n-2];
        }
    }
    public static void main(String[] args) {
        int n = 6;
        memoArr = new int[n];
        Arrays.fill(memoArr,-1); // filling array with -1
        System.out.println(fib(n));
    }
}
