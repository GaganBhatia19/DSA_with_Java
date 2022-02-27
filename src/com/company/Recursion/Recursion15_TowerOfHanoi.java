package com.company.Recursion;

public class Recursion15_TowerOfHanoi {
    // Time Complexity: O(2^n)
    // A: source
    // B: using
    // C: destination

    static int stepCounter = 0;
    public static void towerOfHanoi(int ringNo,int A,int B,int C) {
        if(ringNo>0) {
            stepCounter++;
            towerOfHanoi(ringNo-1,A,C,B);
            System.out.println("Move ring "+ringNo+" from A: "+A+" to C: "+C+" using B: "+B);
            towerOfHanoi(ringNo-1,B,A,C);
        }
    }
    public static void main(String[] args) {
        towerOfHanoi(3,1,2,3); // initially A:1,B:2,C:3
        System.out.println("Number of Steps = "+stepCounter);
    }
}
