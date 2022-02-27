package com.company.Recursion;

public class Recursion14_nCr_combinations {

    public static int nCr_usingFactorial(int n,int r) {
        // using factorial function from recursion 8
        int nFact = Recursion8_factorialN.factorialN(n); // n!
        int rFact = Recursion8_factorialN.factorialN(r); // r!
        int nrFact = Recursion8_factorialN.factorialN(n-r);// (n-r)!
        // nCr = n!/(r!*(n-r)!);
        return nFact/(rFact*(nrFact));
    }

    public static int C(int n,int r) {
        // using pascal's triangle method
        if(r==0 || n==r) return 1;
        else
            return C(n-1,r-1)+C(n-1,r);
    }

    public static void main(String[] args) {
        // n should be greater than r
        System.out.println(nCr_usingFactorial(4,2));
        System.out.println(C(4,2));
    }
}
